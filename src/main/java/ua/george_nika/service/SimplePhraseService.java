package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 16.05.16.
 */
@Service
public class SimplePhraseService {


    @Autowired
    PronounService pronounService;

    public String getSimplePhrase(){
        StringBuilder result = new StringBuilder();

        result.append(pronounService.getSimplePronoun());
        return result.toString();
    }
}
