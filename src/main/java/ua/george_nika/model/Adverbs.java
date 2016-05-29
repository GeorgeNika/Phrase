package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adverbs extends AbstractEntity {

    Adverbs(){


        addEntity("хорошо","","");
        addEntity("правильно","","");
        addEntity("понятно","","");
        addEntity("молодец","","");

        addEntity("приятно","נעים","наим");
        addEntity("простите","סליחה","слиха");
        addEntity("сейчас","עכשיו","ахшав");

        addEntity("немного","","");
        addEntity("много","","");
        addEntity("тогда","","");
        addEntity("возможно","אולי","улай");
        addEntity("возле","על יד","аль яд");
        addEntity("хорошо","","");
        addEntity("ничего","","");
        addEntity("жаль","","");
        addEntity("очень","מאוד","меод");
        addEntity("можно","","");

        addEntity("это (м,ж,мн)","זה זאת אלה","зе зот эле");
        addEntity("вовремя","בזמן","бэзман(базман)");
        addEntity("ещё","עוד","од");
        addEntity("когда (повестовательно что-то происходит)","כש","кше");
        addEntity("все (вместе, но не всё)","כולם","кулям");
        addEntity("всё (хватит, стоп)","","зеу");


    }

}
