package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Geography extends AbstractEntity{

    Geography(){

        addEntity("Украина","אוקראינה","украина");
        addEntity("мертвое(соленое) море", "ים המלח", "ям амелах");


    }

}
