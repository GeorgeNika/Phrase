package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Union extends AbstractEntity {

    Union(){


        addEntity("из","מ","ми");
        addEntity("и","ו","вэ");
        addEntity("тоже","גם","гам");

        addEntity("в (внутри)", "ב", "бэ");




    }

}
