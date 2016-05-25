package ua.george_nika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.george_nika.model.Noun;
import ua.george_nika.model.Question;

/**
 * Created by user on 16.05.16.
 */

@Service
public class QuestionService {

    @Autowired
    Question question;

    @Autowired
    RandomService randomService;

    public String getQuestion() {

        return question.getRandomEntity();
    }
}
