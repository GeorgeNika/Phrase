package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 16.05.16.
 */
@Service
public class PhraseService {


    @Autowired
    PronounService pronounService;

    @Autowired
    NounService nounService;

    @Autowired
    VerbService verbService;

    @Autowired
    AdjectiveService adjectiveService;

    @Autowired
    QuestionService questionService;

    @Autowired
    RandomService randomService;

    public String getSimplePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(pronounService.getSimplePronoun());
        result.append("  ");
        result.append(verbService.getSimpleVerb());
        result.append("  ");
        result.append(randomService.getPositiveOrNegative(nounService.getSimpleNoun()));
        result.append("  ");
        return result.toString();
    }

    public String getInfinitivePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(pronounService.getSimplePronoun());
        result.append("  ");
        result.append(randomService.getPositiveOrNegative(verbService.getActiveVerb()));
        result.append("  ");
        result.append(verbService.getSimpleVerb());
        result.append("  ");
        result.append(nounService.getSimpleNoun());
        result.append("  ");
        return result.toString();
    }

    public String getNumberPhrase(){
        StringBuilder result = new StringBuilder();

        result.append(pronounService.getSimplePronoun());
        result.append("  ");
        result.append(verbService.getSimpleVerb());
        result.append("  ");
        result.append(randomService.getRandomOrder(" " + randomService.getRandomInt(100), nounService.getSimpleNoun()));
        result.append("  ");
        return result.toString();
    }

    public String getAdjectivePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(pronounService.getSimplePronoun());
        result.append("  ");
        result.append(verbService.getSimpleVerb());
        result.append("  ");
        result.append(randomService.getRandomOrder(adjectiveService.getSimpleAdjective(), nounService.getSimpleNoun()));
        result.append("  ");
        return result.toString();
    }

    public String getOwnPhrase(){
        StringBuilder result = new StringBuilder();

        result.append(randomService.getRandomOrder(adjectiveService.getSimpleAdjective(), nounService.getSimpleNoun()));
        result.append("  ");
        result.append(pronounService.getOwnPronoun());
        return result.toString();
    }

    public String getHavePhrase(){
        StringBuilder result = new StringBuilder();


        result.append(pronounService.getHavePronoun());
        result.append("  ");
        result.append(randomService.getRandomOrder(adjectiveService.getSimpleAdjective(), nounService.getSimpleNoun()));
        return result.toString();
    }

    public String getAdverbs(){
        StringBuilder result = new StringBuilder();


        result.append(verbService.getAdverbs());
        return result.toString();
    }

    public String getQuestion(){
        StringBuilder result = new StringBuilder();


        result.append(questionService.getQuestion());
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
