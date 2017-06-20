package ua.george_nika.model;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by george on 19.05.2016.
 */
abstract public class AbstractEntity {

    private Random random = new Random();

    protected ArrayList<String> entityList = new ArrayList<String>();
    protected Map<String, String> translateMap = new HashMap<String, String>();
    protected Map<String, String> transcriptionMap = new HashMap<String, String>();

    public ThreeString getRandomEntity(){
        String russian = entityList.get(random.nextInt(entityList.size()-1));
        return new ThreeString(russian, translateMap.get(russian), transcriptionMap.get(russian));
    }

    protected void addEntity(String russian, String translate, String transcription){

        entityList.add(russian);
        translateMap.put(russian, translate);
        transcriptionMap.put(russian, transcription);
    }

}
