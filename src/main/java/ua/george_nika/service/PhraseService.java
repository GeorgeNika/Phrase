package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 16.05.16.
 */
@Service
public class PhraseService {


    @Autowired
    ModelService modelService;

    @Autowired
    RandomService randomService;

    public String getSimplePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(modelService.getSimplePronoun());
        result.append("  ");
        result.append(modelService.getSimpleVerb());
        result.append("  ");
        result.append(randomService.getPositiveOrNegative(modelService.getSimpleNoun()));
        result.append("  ");
        return result.toString();
    }

    public String getInfinitivePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(modelService.getSimplePronoun());
        result.append("  ");
        result.append(randomService.getPositiveOrNegative(modelService.getActiveVerb()));
        result.append("  ");
        result.append(modelService.getSimpleVerb());
        result.append("  ");
        result.append(modelService.getSimpleNoun());
        result.append("  ");
        return result.toString();
    }

    public String getNumberPhrase(){
        StringBuilder result = new StringBuilder();

        result.append(modelService.getSimplePronoun());
        result.append("  ");
        result.append(modelService.getSimpleVerb());
        result.append("  ");
        int randomInt = randomService.getRandomInt(100);
        if (randomInt==1){
            result.append(modelService.getSimpleNoun());
            result.append("  1");
        }else{
            result.append(randomInt);
            result.append("  ");
            result.append(modelService.getSimpleNoun());
        }
        result.append("  ");
        return result.toString();
    }

    public String getAdjectivePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(modelService.getSimplePronoun());
        result.append("  ");
        result.append(modelService.getSimpleVerb());
        result.append("  ");
        result.append(modelService.getSimpleNoun());
        result.append("  ");
        result.append(modelService.getSimpleAdjective());
        result.append("  ");
        return result.toString();
    }

    public String getOwnPhrase(){
        StringBuilder result = new StringBuilder();

        result.append(modelService.getSimpleNoun());
        result.append("  ");
        result.append(modelService.getSimpleAdjective());
        result.append("  ");
        result.append(modelService.getOwnPronoun());
        return result.toString();
    }

    public String getHavePhrase(){
        StringBuilder result = new StringBuilder();


        result.append(modelService.getHavePronoun());
        result.append("  ");
        result.append(modelService.getSimpleNoun());
        result.append("  ");
        result.append(modelService.getSimpleAdjective());
        return result.toString();
    }

    public String getAdverbs(){
        StringBuilder result = new StringBuilder();


        result.append(modelService.getAdverbs());
        return result.toString();
    }

    public String getQuestion(){
        StringBuilder result = new StringBuilder();


        result.append(modelService.getQuestion());
        return result.toString();
    }

    public String getRandomPhrase(){
        switch (randomService.getRandomInt(7)+1){
            case 1: return getSimplePhrase();
            case 2: return getInfinitivePhrase();
            case 3: return getNumberPhrase();
            case 4: return getAdjectivePhrase();
            case 5: return getOwnPhrase();
            case 6: return getHavePhrase();
            case 7: return getQuestion();
            case 8: return getAdverbs();

            default: return getSimplePhrase();
        }
    }
}
