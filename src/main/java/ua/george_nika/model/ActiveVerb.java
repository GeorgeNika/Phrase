package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class ActiveVerb extends AbstractEntity{

    ActiveVerb(){

        addEntity("хотеть","","");   
        addEntity("делать","","");
        addEntity("должен","","");
        addEntity("знать","","");
        addEntity("спрашивать","","");
        addEntity("покупать","","");
        addEntity("читать","","");
        addEntity("уметь","","");
        addEntity("любить","","");
    }


}
