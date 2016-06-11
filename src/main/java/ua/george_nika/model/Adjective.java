package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adjective extends AbstractEntity {

    Adjective() {

        addEntity("хороший", "טוב", "тов");
        addEntity("новый", "חדש", "хадаш");
        addEntity("большой", "גדול", "гадоль");
        addEntity("маленький", "קטן", "катан");
        addEntity("больной", "חולה", "холе");
        addEntity("красивый", "יפה", "яфе");
        addEntity("интересный", "מעניין", "меаньен");
        addEntity("симпатичный", "נחמד", "нехмад");
        addEntity("милый", "נחמד", "нехмад");
        addEntity("дорогой","יקר", "якар");
        addEntity("важный", "חשוב", "хашув");
        addEntity("пожилой", "צקן", "закен");
        addEntity("женатый", "נשוי", "насуй");
        addEntity("полный", "גמור", "гамур");
        addEntity("взрослый", "מבוגר", "мевугар");

        addEntity("чёрный", "שחור", "шахор");
        addEntity("белый", "לבן", "лаван");

        addEntity("веселый", "שמח", "самех");

        addEntity("еврейский", "עברי", "иври");
        addEntity("тёжелый", "קשה", "каше");

    }

}
