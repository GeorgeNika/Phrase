package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.HavePronoun;
import ua.george_nika.model.OwnPronoun;
import ua.george_nika.model.Pronoun;

/**
 * Created by user on 16.05.16.
 */

@Service
public class PronounService {

    @Autowired
    Pronoun pronoun;

    @Autowired
    RandomService randomService;

    @Autowired
    OwnPronoun ownPronoun;

    @Autowired
    HavePronoun havePronoun;

    public String getSimplePronoun() {

        return pronoun.getRandomEntity();
    }

    public String getOwnPronoun() {

        return ownPronoun.getRandomEntity();
    }

    public String getHavePronoun() {

        return "У "+havePronoun.getRandomEntity()+" "+randomService.getRandomExistence();
    }
}
