package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adjective extends AbstractEntity {

    Adjective(){

        entityList.add("хороший");
        entityList.add("новый");
        entityList.add("большой");
        entityList.add("маленький");
        entityList.add("больной");
        entityList.add("красивый");
        entityList.add("интересный");
        entityList.add("симпатичный");
        entityList.add("дорогой");
        entityList.add("важный");
        entityList.add("пожилой");
        entityList.add("женатый");



    }

}
