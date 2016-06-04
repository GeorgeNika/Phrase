package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Geography extends AbstractEntity{

    Geography(){

        addEntity("Украина","אוקראינה","украина");
        addEntity("мертвое(соленое) море", "ים המלח", "ямамелах");
        addEntity("красное море", "ים אדום", "ямадом");
        addEntity("средиземное море", "ים תיכון", "яматихон");
        addEntity("море кинерет", "ים כנרת", "ямкинерет");

        addEntity("Ливан", "לבנון", "ливанон");
        addEntity("Сирия", "סוריה", "сурия");
        addEntity("Иордания", "ירדן", "ярден");
        addEntity("Египет", "מצרים", "мицраин");
        addEntity("Франция", "צרפת", "царфат");
        addEntity("Испания", "ספרד", "сфарад");
        addEntity("Китай", "סין", "син");
        addEntity("Индия", "הודו", "ходу");
        addEntity("домой к себе", "הביתה", "хабайта");

    }

}
