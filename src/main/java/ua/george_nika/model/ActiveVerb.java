package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class ActiveVerb extends AbstractEntity{

    ActiveVerb(){

        addEntity("хочу","רוצה","роце");
        addEntity("должен","צריך","царих");
        addEntity("умею","יודע","йодэа");
        addEntity("люблю","אוהב","охев");
        addEntity("еду","נוסע","носе");
        addEntity("иду","הולך","холех");
    }


}
