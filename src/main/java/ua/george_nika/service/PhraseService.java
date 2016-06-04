package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.stereotype.Service;
import ua.george_nika.model.ThreeString;

/**
 * Created by user on 16.05.16.
 */

// not Thread Safe
@Service
public class PhraseService {

    protected StringBuilder resultRussian = new StringBuilder();
    protected StringBuilder resultTranslate = new StringBuilder();
    protected StringBuilder resultTranscription = new StringBuilder();


    @Autowired
    ModelService modelService;

    @Autowired
    RandomService randomService;

    public ThreeString getSimplePhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(modelService.getSimpleVerb());
        appendToResult(randomService.getPositiveOrNegative(modelService.getSimpleNoun()));
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getInfinitivePhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(randomService.getPositiveOrNegative(modelService.getActiveVerb()));
        appendToResult(modelService.getInfinitiveVerb());
        appendToResult(modelService.getSimpleNoun());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getNumberPhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(modelService.getSimpleVerb());
        int randomInt = randomService.getRandomInt(100);
        if (randomInt == 1) {
            appendToResult(modelService.getSimpleNoun());
            appendToResult(new ThreeString(" 1", " 1", " 1"));
        } else {
            appendToResult(new ThreeString(" "+randomInt," "+randomInt," "+randomInt));
            appendToResult(modelService.getSimpleNoun());
        }
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getAdjectivePhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(modelService.getSimpleVerb());
        appendToResult(modelService.getSimpleNoun());
        appendToResult(modelService.getSimpleAdjective());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getOwnPhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimpleNoun());
        appendToResult(modelService.getSimpleAdjective());
        appendToResult(modelService.getOwnPronoun());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getHavePhrase() {
        clearStringBuilder();

        appendToResult(modelService.getHavePronoun());
        appendToResult(modelService.getSimpleNoun());
        appendToResult(modelService.getSimpleAdjective());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getAdverbs() {
        return modelService.getAdverbs();
    }

    public ThreeString getQuestion() {
        return modelService.getQuestion();
    }

    public ThreeString getHello() {
        return modelService.getHello();
    }

    public ThreeString getUnionPhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(modelService.getSimpleVerb());
        appendToResult(randomService.getPositiveOrNegative(modelService.getSimpleNoun()));
        appendToResult(modelService.getUnion());
        appendToResult(modelService.getSimpleVerb());
        appendToResult(modelService.getSimpleNoun());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getGeographyPhrase() {
        clearStringBuilder();

        appendToResult(modelService.getSimplePronoun());
        appendToResult(randomService.getPositiveOrNegative(modelService.getMoveVerb()));
        appendToResult(modelService.getGeography());
        return new ThreeString(resultRussian.toString(), resultTranslate.toString(), resultTranscription.toString());
    }

    public ThreeString getRandomPhrase() {
        switch (randomService.getRandomInt(10) + 1) {
            case 1:
                return getSimplePhrase();
            case 2:
                return getInfinitivePhrase();
            case 3:
                return getNumberPhrase();
            case 4:
                return getAdjectivePhrase();
            case 5:
                return getOwnPhrase();
            case 6:
                return getHavePhrase();
            case 7:
                return getQuestion();
            case 8:
                return getAdverbs();
            case 9:
                return getHello();
            case 10:
                return getUnionPhrase();
            case 11:
                return getGeographyPhrase();

            default:
                return getSimplePhrase();
        }
    }

    private void clearStringBuilder() {
        resultRussian = new StringBuilder();
        resultTranslate = new StringBuilder();
        resultTranscription = new StringBuilder();
    }

    private void appendToResult(ThreeString entity) {
        resultRussian.append(entity.getRussian()).append(" ");
        resultTranslate.append(entity.getTranslate()).append(" ");
        resultTranscription.append(entity.getTranscription()).append(" ");
    }
}
