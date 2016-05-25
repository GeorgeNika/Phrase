package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adverbs extends AbstractEntity {

    Adverbs(){

        entityList.add("немного");
        entityList.add("много");
        entityList.add("тогда");
        entityList.add("возможно");
        entityList.add("возле");
        entityList.add("хорошо");
        entityList.add("ничего");
        entityList.add("жаль");
        entityList.add("очень");
        entityList.add("можно");



    }

}
