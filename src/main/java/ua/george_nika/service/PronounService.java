package ua.george_nika.service;

import org.springframework.stereotype.Service;
import ua.george_nika.model.Pronoun;

/**
 * Created by user on 16.05.16.
 */

@Service
public class PronounService {

    public String getSimplePronoun() {

        Long randomPronoun = Math.round(Math.random() * Pronoun.simplePronoun.length);

        return Pronoun.simplePronoun[randomPronoun.intValue()];
    }
}
