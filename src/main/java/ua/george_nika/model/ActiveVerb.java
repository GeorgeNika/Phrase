package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class ActiveVerb extends AbstractEntity{

    ActiveVerb(){

        addEntity("хочу","רוצה","роце");
        addEntity("нуждаюсь","צריך","царих");
        addEntity("умею","יודע","йодэа");
        addEntity("люблю","אוהב","охев");
        addEntity("еду","נוסע","носе");
        addEntity("иду","הולך","холех");
        addEntity("могу","יכול","яхоль");
        addEntity("должен","חייב","хаяв");
    }


}
