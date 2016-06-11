package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class OwnPronoun extends AbstractEntity{

    OwnPronoun(){

        addEntity("Мой(моя)","שלי","шели");
        addEntity("Твой(твоя) (м)","שלך","шельха");
        addEntity("Твой(твоя) (ж)","שלך","шалах");
        addEntity("Его","שלו","шело");
        addEntity("Её","שלה","шела");
        addEntity("Наше","שלנו","шелану");
        addEntity("Ваше (м)","שלכם","шелахем");
        addEntity("Ваше (ж)","שלכן","шелахен");
        addEntity("Их (м)","שלהם","шелахем");
        addEntity("Их (ж)","שלהן","шелахен");

    }

}
