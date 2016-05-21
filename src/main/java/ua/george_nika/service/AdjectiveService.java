package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.Adjective;
import ua.george_nika.model.Noun;

/**
 * Created by user on 16.05.16.
 */

@Service
public class AdjectiveService {

    @Autowired
    Adjective adjective;

    @Autowired
    RandomService randomService;

    public String getSimpleAdjective() {

        return adjective.getRandomEntity();
    }
}
