package ua.george_nika.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Kat on 17.02.2017.
 */
@Component
public class KeepAlive {

    @Scheduled (fixedDelay =60000)
    public void doSomething(){
        System.out.print("Keep Alive ");
    }
}
