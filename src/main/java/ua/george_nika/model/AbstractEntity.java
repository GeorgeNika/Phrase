package ua.george_nika.model;

import java.util.ArrayList;

/**
 * Created by george on 19.05.2016.
 */
abstract public class AbstractEntity {

    protected ArrayList<String> entityList = new ArrayList<String>();

    public String getRandomEntity(){
        Long randomLong = Math.round(Math.random()*(entityList.size()-1));

        return entityList.get(randomLong.intValue());
    }

    public int getCount(){
        return entityList.size();
    }
}
