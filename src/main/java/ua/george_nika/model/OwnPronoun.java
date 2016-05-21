package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class OwnPronoun extends AbstractEntity{

    OwnPronoun(){

        entityList.add("Мой(моя)");
        entityList.add("Твой(твоя) (м)");
        entityList.add("Твой(твоя) (ж)");
        entityList.add("Его");
        entityList.add("Её");
        entityList.add("Наше");
        entityList.add("Ваше (м)");
        entityList.add("Ваше (ж)");
        entityList.add("Их (м)");
        entityList.add("Их (ж)");

    }

}
