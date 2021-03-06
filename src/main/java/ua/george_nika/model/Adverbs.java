package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Adverbs extends AbstractEntity {

    Adverbs(){

        addEntity("правильно","נכון","нахон");
        addEntity("верно","נכון","нахон");
        addEntity("понятно","ברור","барур");

        addEntity("приятно","נעים","наим");
        addEntity("простите","סליחה","слиха");
        addEntity("сейчас", "עכשיו", "ахшав");
        addEntity("спасибо","תודה","тода");
        addEntity("спасибо большое","תודה רבה","тода раба");
        addEntity("пожалуйста","בבקשה","бевакаша");
        addEntity("подожди(момент)","רגע","рега");
        addEntity("будет","יהיה","игье");
        addEntity("ой","אוי","ой");
        addEntity("или","או","о");

        addEntity("сегодня","היום","хайом");
        addEntity("завтра","מחר","махар");
        addEntity("вчера","אתמול","этмоль");
        addEntity("До свидания.","להתראות","лехитраот");
        addEntity("Слава богу.","ברוך השם!","барух хашем");

        addEntity("немного","קצת","кцат");
        addEntity("много","הרבה","харбе");
        addEntity("там","שם","шам");
        addEntity("туда","לשם","лешам");
        addEntity("тебе","לך","льха (лах)");
        addEntity("есть","יש","еш");
        addEntity("возможно","אולי","улай");
        addEntity("возле","על יד","аль яд");
        addEntity("здесь","פה","по");
        addEntity("хорошо","טוב","тов");
        addEntity("не плохо","לא רע","ле ра");
        addEntity("плохо","רע","ра");
        addEntity("ничего","שום דבר","шум давар");
        addEntity("очень","מאוד","меод");
        addEntity("можно","אפשר","эфшар");

        addEntity("это (м,ж,мн)","זה זאת אלה","зе зот эле");
        addEntity("вовремя","בזמן","бэзман(базман)");
        addEntity("ещё","עוד","од");
        addEntity("когда (повестовательно что-то происходит)","כש","кше");
        addEntity("как (похожесть)","כמו","кмо");
        addEntity("всё ","הכול","аколь");
        addEntity("все (вместе, но не всё)","כולם","кулям");
        addEntity("отлично","מצוין","мецуян");

        addEntity("каждый","כל","коль");
        addEntity("каждый день","כל יום","коль йом");
        addEntity("целый день","כל היום","коль хайом");
        addEntity("есть (в наличии)","יש","еш");
        addEntity("нет (в наличии)","אין","эйн");

        addEntity("по поводу (в связи с)","בקשר ל","бекешер ле");
        addEntity("этот","הזה","хазе");

        addEntity("моё имя","שמי","шми");
        addEntity("меня зовут","קור'ם לי","корим ли");
        addEntity("брата моего зовут","לאח שלי קור'ם","леах шели корим");
        addEntity("день рождения","יום הולדת","йом хуледет");
        addEntity("праздник день рождения весёлый (с днем рождения)","חג יום הולדת שמח","хаг йом хуледет самех");
        addEntity("сейчас 19 часов","השעה 19","хашаа теша эсре");





    }

}
