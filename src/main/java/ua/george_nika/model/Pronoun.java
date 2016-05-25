package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Pronoun extends AbstractEntity{

    Pronoun (){

        addEntity("Я","","");
        addEntity("Ты (м)","","");
        addEntity("Ты (ж)","","");
        addEntity("Он","","");
        addEntity("Она","","");
        addEntity("Мы","","");
        addEntity("Вы (м)","","");
        addEntity("Вы (ж)","","");
        addEntity("Они (м)","","");
        addEntity("Они (ж)","","");

    }

}
