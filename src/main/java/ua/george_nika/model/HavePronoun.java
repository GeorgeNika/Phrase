package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class HavePronoun extends AbstractEntity{

    HavePronoun(){

        entityList.add("Меня)");
        entityList.add("Тебя (м)");
        entityList.add("Тебя (ж)");
        entityList.add("Него");
        entityList.add("Неё");
        entityList.add("Нас");
        entityList.add("Вас (м)");
        entityList.add("Вас (ж)");
        entityList.add("Них (м)");
        entityList.add("Них (ж)");

    }

}
