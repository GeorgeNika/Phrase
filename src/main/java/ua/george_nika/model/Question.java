package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Question extends AbstractEntity{

    Question(){

        addEntity("Потому-что.","","");
        addEntity("Чьё ?","","");
        addEntity("Я по поводу.","","");
        addEntity("Что номер телефона твой ?","","");
        addEntity("У кого есть ?","","");
        addEntity("Есть вопросы ?","","");
        addEntity("До свидания.","","");

        addEntity("Как твоё имя ?","","");
        addEntity("Сколько тебе лет ?","","");
        addEntity("Кому? ","","");
        addEntity("С кем ?","","");

    }

}
