package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.ActiveVerb;
import ua.george_nika.model.Adverbs;
import ua.george_nika.model.SimpleVerb;

/**
 * Created by user on 16.05.16.
 */

@Service
public class VerbService {

    @Autowired
    SimpleVerb simpleVerb;

    @Autowired
    ActiveVerb activeVerb;

    @Autowired
    Adverbs adverbs;



    @Autowired
    RandomService randomService;

    public String getSimpleVerb() {

        return simpleVerb.getRandomEntity();
    }

    public String getActiveVerb() {

        return activeVerb.getRandomEntity();
    }

    public String getAdverbs() {

        return adverbs.getRandomEntity();
    }
}
