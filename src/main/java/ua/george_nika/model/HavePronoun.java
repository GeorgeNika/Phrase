package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class HavePronoun extends AbstractEntity{

    HavePronoun(){

        addEntity("Меня)","לי","ли");
        addEntity("Тебя (м)","לך","льха");
        addEntity("Тебя (ж)","לך","лах");
        addEntity("Него","לו","ло");
        addEntity("Неё","לה","ла");
        addEntity("Нас","לנו","лану");
        addEntity("Вас (м)","לכם","лахем");
        addEntity("Вас (ж)","לכן","лахен");
        addEntity("Них (м)","להם","лахем");
        addEntity("Них (ж)","להן","лахен");

    }

}
