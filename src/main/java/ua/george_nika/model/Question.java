package ua.george_nika.model;

import org.springframework.stereotype.Component;

/**
 * Created by user on 16.05.16.
 */
@Component
public class Question extends AbstractEntity{

    Question(){

        addEntity("Кто?","מי?","ми?");
        addEntity("Что?","מה?","ма?");
        addEntity("Откуда?","מאין?","мэайн?");
        addEntity("Кто ты?","מי אתה(את)?","ми ата(ат)?");
        addEntity("Кто это?","מי זה?","ми зэ?");
        addEntity("Что это?","מה זה?","ма зэ?");
        addEntity("Где?","איפה?","эйфо?");
        addEntity("Какой?","איזה?","эйзе?");
        addEntity("Как?","איך?","эйх?");
        addEntity("Что случилось?","מה קרה?","ма кара?");
        addEntity("Какой день сегодня?","איזה יום היום","эйзе йом хайом?");
        addEntity("Почему?","מדוע?","мадуа?");
        addEntity("Зачем?","למה?","лама?");
        addEntity("Когда?","מתי?","матай?");
        addEntity("Куда?","לאן?","леан?");
        addEntity("Сколько?","כמה?","кама?");

        addEntity("Чьё?","של מי?","шель ми?");
        addEntity("Я по поводу.","***","***");

        addEntity("У кого есть?","למי יש?","ле ми еш?");
        addEntity("Есть вопросы ?","***","***");

        addEntity("Как твоё имя (м/ж)?","מה שמך / מה שמך","ма шимха? / ма шмех?");
        addEntity("Как тебя зовут?","איף קוראים לף?","эйх корим льха?");
        addEntity("Сколько тебе лет?","בן כמה אתה?","бен кама ата?");
        addEntity("Сколько это стоит?","כמה זה עולה?","кама зе оле?");
        addEntity("Кому? ","למי?","ле ми?");
        addEntity("С кем?","עם מי?","им ми?");

        addEntity("Что профессия твоя?","מה המקצוע שלך?","ма хамикцо шельха?");
        addEntity("Что номер телефона твой ?","מה מספר הטלפון שלך?","ма миспар хателефон шельха?");
        addEntity("Что имя этой улицы ?","מה שם הרחוב","ма миспар хателефон шельха?");

    }

}
