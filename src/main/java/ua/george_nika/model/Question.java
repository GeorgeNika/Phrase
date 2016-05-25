package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Question extends AbstractEntity{

    Question(){

        entityList.add("Потому-что.");
        entityList.add("Чьё ?");
        entityList.add("Я по поводу.");
        entityList.add("Что номер телефона твой ?");
        entityList.add("У кого есть ?");
        entityList.add("Есть вопросы ?");
        entityList.add("До свидания.");

        entityList.add("Как твоё имя ?");
        entityList.add("Сколько тебе лет ?");
        entityList.add("Кому? ");
        entityList.add("С кем ?");

    }

}
