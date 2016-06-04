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
        addEntity("в (туда)", "ל", "лэ");
        addEntity("у", "ל", "лэ");
        addEntity("но","אבל","аваль");
        addEntity("только","רק","рак");
        addEntity("потому-что","כי","ки");
        addEntity("с","עם","им");
        addEntity("тогда","אז","аз");
        addEntity("о (про)","על","аль");
        addEntity("ещё","עוד","од");
        addEntity("в качестве(как, похож)","כ","ке");




    }

}
