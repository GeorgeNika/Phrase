package ua.george_nika.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by george on 19.05.2016.
 */
abstract public class AbstractEntity {

    protected ArrayList<String> entityList = new ArrayList<String>();
    protected Map<String, String> translateMap = new HashMap<String, String>();
    protected Map<String, String> transcriptionMap = new HashMap<String, String>();

    public ThreeString getRandomEntity(){
        Long randomLong = Math.round(Math.random()*(entityList.size()-1));
        String russian = entityList.get(randomLong.intValue());
        return new ThreeString(russian, translateMap.get(russian), transcriptionMap.get(russian));
    }

    protected void addEntity(String russian, String translate, String transcription){

        entityList.add(russian);
        translateMap.put(russian, translate);
        transcriptionMap.put(russian, transcription);
    }

}
