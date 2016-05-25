package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adjective extends AbstractEntity {

    Adjective() {

        addEntity("хороший", "", "");
        addEntity("новый", "", "");
        addEntity("большой", "", "");
        addEntity("маленький", "", "");
        addEntity("больной", "", "");
        addEntity("красивый", "", "");
        addEntity("интересный", "", "");
        addEntity("симпатичный", "", "");
        addEntity("дорогой", "", "");
        addEntity("важный", "", "");
        addEntity("пожилой", "", "");
        addEntity("женатый", "", "");

    }

}
