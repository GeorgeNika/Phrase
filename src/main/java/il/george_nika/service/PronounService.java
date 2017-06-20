package il.george_nika.service;

import il.george_nika.model.LanguageUnit;
import il.george_nika.model.pronoun.Pronoun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static il.george_nika.model.ModelConstants.*;

/**
 * Created by George on 16.06.2017.
 */
@Service
public class PronounService {

    @Autowired
    RandomService randomService;

    private List<Pronoun> pronouns = new ArrayList<Pronoun>();

    public Pronoun getPronoun(){
        return pronouns.get(randomService.getRandom(pronouns.size()));
    }

    {
        pronouns.add(new Pronoun(new LanguageUnit("Я (м)","אני","ани"), GENDER_MASCULINE, QUANTITY_SINGULAR, PERSON_FIRST));
        pronouns.add(new Pronoun(new LanguageUnit("Я (ж)","אני","ани"), GENDER_FEMININE, QUANTITY_SINGULAR, PERSON_FIRST));
        pronouns.add(new Pronoun(new LanguageUnit("Ты (м)","אתה","ата"),GENDER_MASCULINE, QUANTITY_SINGULAR, PERSON_SECOND));
        pronouns.add(new Pronoun(new LanguageUnit("Ты (ж)","את","ат"), GENDER_FEMININE ,QUANTITY_SINGULAR, PERSON_SECOND));
        pronouns.add(new Pronoun(new LanguageUnit("Он","הוא","ху"), GENDER_MASCULINE, QUANTITY_SINGULAR, PERSON_THIRD));
        pronouns.add(new Pronoun(new LanguageUnit("Она","היא","хи"), GENDER_FEMININE, QUANTITY_SINGULAR, PERSON_THIRD));
        pronouns.add(new Pronoun(new LanguageUnit("Мы","אנחנו","анахну"), GENDER_MASCULINE, QUANTITY_PLURAL, PERSON_FIRST));
        pronouns.add(new Pronoun(new LanguageUnit("Вы (м)","אתם","атем"), GENDER_MASCULINE, QUANTITY_PLURAL, PERSON_SECOND));
        pronouns.add(new Pronoun(new LanguageUnit("Вы (ж)","אתן","атен"), GENDER_FEMININE, QUANTITY_PLURAL, PERSON_SECOND));
        pronouns.add(new Pronoun(new LanguageUnit("Они (м)","הם","хем"), GENDER_MASCULINE, QUANTITY_PLURAL, PERSON_THIRD));
        pronouns.add(new Pronoun(new LanguageUnit("Они (ж)","הן","хен"), GENDER_FEMININE, QUANTITY_PLURAL, PERSON_THIRD));
    }
}
