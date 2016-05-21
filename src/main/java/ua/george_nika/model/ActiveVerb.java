package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class ActiveVerb extends AbstractEntity{

    ActiveVerb(){

        entityList.add("хотеть");
        entityList.add("делать");
        entityList.add("должен");
        entityList.add("знать");
        entityList.add("спрашивать");
        entityList.add("покупать");
        entityList.add("читать");
        entityList.add("уметь");
        entityList.add("любить");
    }


}
