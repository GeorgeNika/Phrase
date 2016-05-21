package ua.george_nika.service;

import org.springframework.stereotype.Service;

/**
 * Created by george on 19.05.2016.
 */
@Service
public class RandomService {

    public String getRandomOrder(String str1, String str2){

        if (Math.random()>0.5){
            return str1+" "+str2;
        }
        return str2+" "+str1;
    }

    public int getRandomInt(int max){
        Long randomLong = Math.round(Math.random()*max+1);
        return randomLong.intValue();
    }

    public String getPositiveOrNegative(String str){
        if (Math.random()>0.75){
            return "не "+str;
        }
        return str;
    }

    public String getRandomExistence(){
        if (Math.random()>0.6){
            return "нет";
        }
        return "есть";
    }



}
