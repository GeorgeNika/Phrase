package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class HavePronoun extends AbstractEntity{

    HavePronoun(){

        addEntity("Меня)","","");
        addEntity("Тебя (м)","","");
        addEntity("Тебя (ж)","","");
        addEntity("Него","","");
        addEntity("Неё","","");
        addEntity("Нас","","");
        addEntity("Вас (м)","","");
        addEntity("Вас (ж)","","");
        addEntity("Них (м)","","");
        addEntity("Них (ж)","","");

    }

}
