package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.stereotype.Service;
import ua.george_nika.model.ThreeString;

/**
 * Created by user on 16.05.16.
 */

@Service
public class PhraseService {

    @Autowired
    ModelService modelService;

    @Autowired
    RandomService randomService;

    public ThreeString getSimplePhrase() {
        ThreeString result = new ThreeString(modelService.getSimplePronoun());
        result.append(randomService.getPositiveOrNegative(modelService.getSimpleVerb()));
        result.append(randomService.getPositiveOrNegative(modelService.getSimpleNoun()));
        return result;
    }

    public ThreeString getInfinitivePhrase() {
        ThreeString result = new ThreeString(modelService.getSimplePronoun());
        result.append(randomService.getPositiveOrNegative(modelService.getActiveVerb()));
        result.append(modelService.getInfinitiveVerb());
        result.append(modelService.getSimpleNoun());
        return result;
    }

    public ThreeString getNumberPhrase() {
        ThreeString result = new ThreeString(modelService.getSimplePronoun());
        result.append(modelService.getSimpleVerb());
        int randomInt = randomService.getRandomInt(100);
        if (randomInt == 1) {
            result.append(modelService.getSimpleNoun());
            result.append(" 1", " 1", " 1");
        } else {
            result.append(" " + randomInt, " " + randomInt, " " + randomInt);
            result.append(modelService.getSimpleNoun());
        }
        return result;
    }

    public ThreeString getAdjectivePhrase() {
        ThreeString result = new ThreeString(modelService.getSimplePronoun());
        result.append(modelService.getSimpleVerb());
        result.append(modelService.getSimpleNoun());
        result.append(modelService.getSimpleAdjective());
        return result;
    }

    public ThreeString getOwnPhrase() {
        ThreeString result = new ThreeString(modelService.getSimpleNoun());
        result.append(modelService.getSimpleAdjective());
        result.append(modelService.getOwnPronoun());
        return result;
    }

    public ThreeString getHavePhrase() {
        ThreeString result = new ThreeString(modelService.getHavePronoun());
        result.append(modelService.getSimpleNoun());
        result.append(modelService.getSimpleAdjective());
        return result;
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
        ThreeString result = new ThreeString(getSimplePhrase());
        result.append(modelService.getUnion());
        result.append(modelService.getSimpleVerb());
        result.append(modelService.getSimpleNoun());
        return result;
    }

    public ThreeString getGeographyPhrase() {
        ThreeString result = new ThreeString(modelService.getSimplePronoun());
        result.append(randomService.getPositiveOrNegative(modelService.getMoveVerb()));
        result.append(modelService.getGeography());
        return result;
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
}
