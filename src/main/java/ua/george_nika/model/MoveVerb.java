package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class MoveVerb extends AbstractEntity{

    MoveVerb(){

        addEntity("живу","גר","гар");
        addEntity("приезжаю","בא","ба");
        addEntity("отдыхаю","נח","нах");
        addEntity("хочу","רוצה","роце");
        addEntity("нуждаюсь","צריך","царих");
        addEntity("должен","צריך","царих");
        addEntity("еду","נוסע","носе");
        addEntity("знаю","יודע","йодэа");
        addEntity("спрашиваю","שואל","шоэль");
        addEntity("читаю","קורא","коре");
        addEntity("люблю","אוהב","охев");
        addEntity("собираюсь","עומד","омед");
        addEntity("иду","הולך","холех");
        addEntity("путешествую","מטייל","метаэль");

    }


}
