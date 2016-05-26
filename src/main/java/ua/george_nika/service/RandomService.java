package ua.george_nika.service;

import org.springframework.stereotype.Service;
import ua.george_nika.model.ThreeString;

/**
 * Created by george on 19.05.2016.
 */
@Service
public class RandomService {

    public int getRandomInt(int max){
        if (Math.random()<0.2){
            return 1;
        }
        if (Math.random()<0.4){
            Long randomLong = Math.round(Math.random()*8+11);
            return randomLong.intValue();
        }
        Long randomLong = Math.round(Math.random()*max+1);
        return randomLong.intValue();
    }

    public ThreeString getPositiveOrNegative(ThreeString str){
        if (Math.random()>0.75){
            str.setRussian(" не "+str.getRussian());
            str.setTranslate(str.getTranslate()+" לא ");
            str.setTranscription(" лё "+str.getTranscription());
            return str;
        }
        return str;
    }

    public ThreeString getRandomExistence(){
        if (Math.random()>0.6){
            return new ThreeString("нет ","אין ","эйн ");
        }
        return new ThreeString("есть ","יש ","еш ");
    }



}
