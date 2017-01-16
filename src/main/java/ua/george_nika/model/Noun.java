package ua.george_nika.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by george on 16.05.2016.
 */
@Component
public class Noun extends AbstractEntity {

    Noun() {

        addEntity("огурцы", "מלפפונים", "мелафефоним");
        addEntity("помидоры", "עגבניות", "агваньйот");
        addEntity("соль", "מלח", "мелах");
        addEntity("море", "ים", "ям");
        addEntity("царь(король)", "מלך", "мелэх");
        addEntity("доска", "לוח ", "луах");
        addEntity("кот", "חתול", "хатуль");
        addEntity("собака", "כלב", "келев");
        addEntity("велосипед", "אופניים", "офанаим");
        addEntity("класс", "כיתה", "кита");
        addEntity("ручка", "עט", "эт");
        addEntity("тетрадь", "מחברת", "махберет");
        addEntity("книга", "ספר", "сефер");
        addEntity("чай", "תה", "тэ");
        addEntity("вода", "מים", "миам");
        addEntity("ночь", "לילה", "лайла");
        addEntity("вечер", "ערב", "эрев");
        addEntity("день", "יום", "йом");
        addEntity("утро", "בוקר", "бокер");
        addEntity("ученик", "תלמיד", "талмид");
        addEntity("турист", "תייר", "таяр");
        addEntity("рынок", "שוק", "шук");
        addEntity("ребенок", "ילד", "елед");

        addEntity("семья", "משפחה", "мишпаха");
        addEntity("мама", "אמא", "има");
        addEntity("папа", "אבא", "аба");
        addEntity("мать", "אם", "эм");
        addEntity("отец", "אב", "ав");
        addEntity("женщина", "אישה", "иша");
        addEntity("мужчина", "בעל", "бааль");
        addEntity("брат", "אח", "ах");
        addEntity("сестра", "אחות", "ахот");
        addEntity("сын", "בן", "бен");
        addEntity("дочь", "בת", "бат");
        addEntity("двоюродный брат", "בן דוד", "бен дод");
        addEntity("племянник (племянница)", "אחין", "ахян");

        addEntity("родители", "הורים", "хорим");
        addEntity("родственники", "קרובים", "кровим");
        addEntity("дядя", "דוד", "дод");
        addEntity("учитель", "מורה", "море");
        addEntity("врач", "רופא", "рофе");
        addEntity("продавец", "מוכר", "мохер");
        addEntity("официант", "מלצר", "мильцар");
        addEntity("офисный работник", "פקיד", "пакид");
        addEntity("клерк", "פקיד", "пакид");
        addEntity("работа", "עבודה", "авода");
        addEntity("деньги", "כסף", "кесеф");
        addEntity("номер", "מספר", "миспар");


        addEntity("бар", "פאב", "паб");
        addEntity("кафе", "בית-קפה", "байт кафе");
        addEntity("супермаркет", "סופר", "супер");
        addEntity("библиотека", "ספרייה", "сифрия");

        addEntity("хлеб", "לחם", "лехем");
        addEntity("булочка", "לחמניה", "лахманья");
        addEntity("вино", "יין", "яин");
        addEntity("пиво", "בירה", "бира");
        addEntity("молоко", "חלב", "халав");
        addEntity("сыр", "גבינה", "гвина");
        addEntity("кефир", "רוויון", "ревьён");
        addEntity("апельсины", "תפוז", "тапузим");
        addEntity("мандарины", "מנדרינות", "мандаринот");
        addEntity("яблоки", "תפוחים", "тапухим");
        addEntity("грушы", "אגסים", "агасим");
        addEntity("сок", "מיץ", "миц");
        addEntity("кофе", "קפה", "кафе");
        addEntity("балкон", "מרפסת", "мирпесет");
        addEntity("окно", "חלון", "халон");
        addEntity("стол", "שולחן", "шульхан");
        addEntity("стул", "כיסא", "кисе");

        addEntity("телевизор", "טלוויזיה", "телевизия");
        addEntity("картина", "תמונה", "тмуна");


        addEntity("карточка", "כרטיס", "картис");
        addEntity("рыбы", "דגים", "дагим");
        addEntity("мясо", "בשר", "басар");
        addEntity("финик", "תמר", "тамар");
        addEntity("инжир", "תאנה", "тейна");
        addEntity("оливка", "זית", "зейт");
        addEntity("лемон", "לימון", "лемон");
        addEntity("мороженное", "גלידה", "глида");
        addEntity("пироженное", "עוגה", "уга");
        addEntity("блинчики", "בלינצ'ס", "блинчес");
        addEntity("сигареты", "סיגריות", "сигарьот");
        addEntity("компьютер", "מחשב", "махшев");
        addEntity("машина", "מכונית", "мехонит");
        addEntity("улица", "רחוב", "рхов");
        addEntity("дедушка (бабушка)", "סבא (סבתא)", "саба (сабта)");
        addEntity("товарищь", "ידיד", "ядид");
        addEntity("парень (девушка)", "בחור (בחורה)", "бахур (бахура)");
        addEntity("друг", "חבר", "хавер");
        addEntity("ребята", "חברה", "хебре");
        addEntity("марка", "בול", "буль");
        addEntity("старожил", "ותיק", "ватик");
        addEntity("урок", "שיעור", "шиур");
        addEntity("домашнее задание", "שיעורי בית", "шиурей байт");
        addEntity("газета", "עיתון", "итон");
        addEntity("письмо", "מכתב", "михтав");

        addEntity("комната", "חדר", "хэдер");
        addEntity("квартира", "דירה", "дира");
        addEntity("дом (дома)", "בית (בתים)", "байт (батим)");
        addEntity("школа (1-5)", "בית ספר", "байт сефер");
        addEntity("школа (5<)", "תיכון", "тихон");
        addEntity("язык (мова)", "שפה", "сафа");

        addEntity("сумка", "תיק", "тик");

        addEntity("диалог (беседа)", "שיחה", "сиха");
        addEntity("контора офис", "משרד", "мисрад");
        addEntity("дело", "עניין", "иньян");
        addEntity("концерт", "קונצרט", "концерт");

        addEntity("госпожа", "גברת", "гверет");
        addEntity("господин", "אדון", "адон");
        addEntity("молодой человек", "אדוני", "адони");
        addEntity("страна", "ארץ", "эрец");
        addEntity("внук", "נכד", "нехед");
        addEntity("очки", "משקפיים", "мишкафайм");
        addEntity("мяч", "כדור", "кадур");
        addEntity("таблетка", "כדור", "кадур");
        addEntity("вопрос", "שאלה", "шейла");
        addEntity("слово (слова)", "מילה (מילים)", "мила (милим)");
        addEntity("словарь", "מילון", "милон");
        addEntity("младенец", "תינוק", "тинок");
        addEntity("проблема", "בעיה", "бэая");
        addEntity("начальник", "מנהל", "менахель");
        addEntity("солдат", "חייל", "хаяль");
        addEntity("фильм", "סרט", "серет");
        addEntity("комп.мышь", "עכבר", "ахбар");
        addEntity("кабель", "כבל", "кабель");
        addEntity("записная книжка", "פנקס", "пинкас");
        addEntity("бутылка", "בקבוק", "бакбук");
        addEntity("зонт", "מטרי", "митрия");
        addEntity("вещь", "דבר", "давар");
        addEntity("экскурсия", "תיול", "тиюль");
        addEntity("электричество", "חשמל", "хашмаль");
        addEntity("поезд", "רכבת", "ракевед");
        addEntity("автобус", "אוטובוס", "отобус");
        addEntity("трамвай", "רכבת חשמלת", "ракевед");
        addEntity("вечеринка", "מסבה", "месиба");
        addEntity("маршрут", "קו", "кав");
        addEntity("фабрика (завод)", "מפעל", "мифаль");
        addEntity("профессия", "מקצוע", "микцоа");
        addEntity("время", "זמן", "зман");
        addEntity("торговый центр", "קניון", "каньён");

        addEntity("охранник", "שומר", "шомер");
        addEntity("полицейский", "שוטר", "шотер");
        addEntity("полиция", "משטרה", "миштара");

        addEntity("вещь одежды (одежда)", "בגד (בגדים)", "бегед (бгадим)");
        addEntity("купальник", "בגד ים", "бегед ям");

        addEntity("конец", "סוף", "соф");
        addEntity("имя (имена)", "שם (שמות)", "шем (шмот)");
        addEntity("фамилия", "שם המשפחה", "шем хамишпаха");

        addEntity("праздник", "חג", "хаг");
        addEntity("ключ (ключи)", "מפתח (מפתחות)", "мафтеах (мафтехот)");
        addEntity("стиральная машинка", "מכונת כביסה", "механит квиса");
        addEntity("холодильник", "מקרר", "мкарер");

        addEntity("город (города)", "עיר (ערים)", "ир (арим)");
        addEntity("час (несколько часов)", "שעה (שעות)", "шаа (шаот)");
        addEntity("здание (строение)", "בניין", "биньян");
        addEntity("сосед", "שכן", "шахен");
        addEntity("кухня", "מטבח", "митбах");
        addEntity("экзамен", "מבחן", "мибхан");


    }

}
