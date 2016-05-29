package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Pronoun extends AbstractEntity{

    Pronoun (){

        addEntity("Я","אני","ани");
        addEntity("Ты (м)","אתה","ата");
        addEntity("Ты (ж)","את","ат");
        addEntity("Он","הוא","ху");
        addEntity("Она","היא","хи");
        addEntity("Мы","אנחנו","анахну");
        addEntity("Вы (м)","אתם","атем");
        addEntity("Вы (ж)","אתן","атен");
        addEntity("Они (м)","הם","хем");
        addEntity("Они (ж)","הן","хен");

    }

}
