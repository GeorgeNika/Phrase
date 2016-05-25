package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class OwnPronoun extends AbstractEntity{

    OwnPronoun(){

        addEntity("Мой(моя)","","");
        addEntity("Твой(твоя) (м)","","");
        addEntity("Твой(твоя) (ж)","","");
        addEntity("Его","","");
        addEntity("Её","","");
        addEntity("Наше","","");
        addEntity("Ваше (м)","","");
        addEntity("Ваше (ж)","","");
        addEntity("Их (м)","","");
        addEntity("Их (ж)","","");

    }

}
