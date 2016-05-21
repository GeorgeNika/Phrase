package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.Noun;
import ua.george_nika.model.Pronoun;

/**
 * Created by user on 16.05.16.
 */

@Service
public class NounService {

    @Autowired
    Noun noun;

    @Autowired
    RandomService randomService;

    public String getSimpleNoun() {

        return noun.getRandomEntity();
    }
}
