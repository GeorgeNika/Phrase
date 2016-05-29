package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class SimpleVerb extends AbstractEntity{

    SimpleVerb(){

        addEntity("живу","גר","гар");
        addEntity("приезжаю","בא","ба");
        addEntity("чувствую","מרגיש","маргиш");
        addEntity("учись","למוד","ламед");
        addEntity("работаю","עובד","овед");
        addEntity("отдыхаю","נח","нах");
        addEntity("делаю","עושה","йоде");
        addEntity("хочу","רוצה","роце");
        addEntity("нуждаюсь","צריך","царих");
        addEntity("должен","צריך","царих");
        addEntity("разговариваю","מדבר","медабер");
        addEntity("пишу","כותב","котев");
        addEntity("еду","נוסע","носе");
        addEntity("знаю","יודע","йодэа");
        addEntity("умею","יודע","йодэа");
        addEntity("спрашиваю","שואל","шоэль");
        addEntity("читаю","קורא","коре");
        addEntity("стоит","עולה","оле");
        addEntity("поднимаюсь","עולה","оле");
        addEntity("покупаю","קונה","коне");
        addEntity("люблю","אוהב","охев");
        addEntity("стою","עומד","омед");
        addEntity("собираюсь","עומד","омед");
        addEntity("иду","הולך","холех");
        addEntity("вожу машину","נוהג","ноэг");
        addEntity("путешествую","מטייל","метаэль");
        addEntity("могу","יכול","яхоль");
        addEntity("говорю","אומר","омер");
        addEntity("кушаю","אוכל","охель");
        addEntity("пью","שותה","шотэ");
        addEntity("сплю","ישן","яшен");




    }


}
