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
    InfinitiveVerb InfinitiveVerb;

    @Autowired
    ActiveVerb activeVerb;

    @Autowired
    MoveVerb moveVerb;

    @Autowired
    Adverbs adverbs;

    @Autowired
    Adjective adjective;

    @Autowired
    Pronoun pronoun;

    @Autowired
    Noun noun;

    @Autowired
    Hello hello;

    @Autowired
    OwnPronoun ownPronoun;

    @Autowired
    HavePronoun havePronoun;

    @Autowired
    Question question;

    @Autowired
    Union union;

    @Autowired
    Geography geography;

    @Autowired
    RandomService randomService;


    public ThreeString getSimpleNoun() {

        return noun.getRandomEntity();
    }

    public ThreeString getSimpleVerb() {

        return simpleVerb.getRandomEntity();
    }

    public ThreeString getInfinitiveVerb() {

        return InfinitiveVerb.getRandomEntity();
    }

    public ThreeString getActiveVerb() {

        return activeVerb.getRandomEntity();
    }

    public ThreeString getMoveVerb() {

        return moveVerb.getRandomEntity();
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

    public ThreeString getHello() {
        return hello.getRandomEntity();
    }

    public ThreeString getHavePronoun() {

        ThreeString existence = randomService.getRandomExistence();
        ThreeString entity = havePronoun.getRandomEntity();
        ThreeString result = new ThreeString("У " + entity.getRussian() + " " + existence.getRussian(),
                existence.getTranslate() + " " + entity.getTranslate(),
                existence.getTranscription() + entity.getTranscription());
        return result;
    }

    public ThreeString getUnion() {
        return union.getRandomEntity();
    }

    public ThreeString getGeography() {
        return geography.getRandomEntity();
    }
}
