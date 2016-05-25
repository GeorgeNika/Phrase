package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.*;

/**
 * Created by user on 16.05.16.
 */

@Service
public class ModelService {

    @Autowired
    SimpleVerb simpleVerb;

    @Autowired
    ActiveVerb activeVerb;

    @Autowired
    Adverbs adverbs;

    @Autowired
    Adjective adjective;

    @Autowired
    Pronoun pronoun;

    @Autowired
    Noun noun;

    @Autowired
    OwnPronoun ownPronoun;

    @Autowired
    HavePronoun havePronoun;

    @Autowired
    Question question;

    @Autowired
    RandomService randomService;


    public ThreeString getSimpleNoun() {

        return noun.getRandomEntity();
    }

    public ThreeString getSimpleVerb() {

        return simpleVerb.getRandomEntity();
    }

    public ThreeString getActiveVerb() {

        return activeVerb.getRandomEntity();
    }

    public ThreeString getAdverbs() {

        return adverbs.getRandomEntity();
    }

    public ThreeString getSimpleAdjective() {

        return adjective.getRandomEntity();
    }

    public ThreeString getSimplePronoun() {

        return pronoun.getRandomEntity();
    }

    public ThreeString getOwnPronoun() {

        return ownPronoun.getRandomEntity();
    }

    public ThreeString getQuestion() {

        return question.getRandomEntity();
    }

    public ThreeString getHavePronoun() {

        ThreeString existence = randomService.getRandomExistence();
        ThreeString entity = havePronoun.getRandomEntity();
        ThreeString result = new ThreeString();
        result.setRussian("У "+entity.getRussian()+" "+existence.getRussian());

        return result;
    }
}
