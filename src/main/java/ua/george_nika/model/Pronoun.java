package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Pronoun extends AbstractEntity{

    Pronoun (){

        entityList.add("Я");
        entityList.add("Ты (м)");
        entityList.add("Ты (ж)");
        entityList.add("Он");
        entityList.add("Она");
        entityList.add("Мы");
        entityList.add("Вы (м)");
        entityList.add("Вы (ж)");
        entityList.add("Они (м)");
        entityList.add("Они (ж)");

    }

}
