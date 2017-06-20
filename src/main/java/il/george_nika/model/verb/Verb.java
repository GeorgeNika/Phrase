package il.george_nika.model.verb;

import il.george_nika.model.LanguageUnit;
import lombok.Data;

import static il.george_nika.model.ModelConstants.*;

@Data
public class Verb {

    private LanguageUnit infinitive;

    private LanguageUnit presentFirstSingularMasculine;
    private LanguageUnit presentFirstSingularFeminine;
    private LanguageUnit presentFirstPlural;

    private LanguageUnit presentSecondSingularMasculine;
    private LanguageUnit presentSecondSingularFeminine;
    private LanguageUnit presentSecondPluralMasculine;
    private LanguageUnit presentSecondPluralFeminine;

    private LanguageUnit presentThirdSingularMasculine;
    private LanguageUnit presentThirdSingularFeminine;
    private LanguageUnit presentThirdPluralMasculine;
    private LanguageUnit presentThirdPluralFeminine;


    private LanguageUnit pastFirstSingularMasculine;
    private LanguageUnit pastFirstSingularFeminine;
    private LanguageUnit pastFirstPlural;

    private LanguageUnit pastSecondSingularMasculine;
    private LanguageUnit pastSecondSingularFeminine;
    private LanguageUnit pastSecondPluralMasculine;
    private LanguageUnit pastSecondPluralFeminine;

    private LanguageUnit pastThirdSingularMasculine;
    private LanguageUnit pastThirdSingularFeminine;
    private LanguageUnit pastThirdPlural;

    public LanguageUnit getLanguageUnit(int gender, int quantity, int person, int time) {
        if (time == TIME_PRESENT) {
            return getPresent(gender, quantity, person);
        }
        if (time == TIME_PAST) {
            //todo
            throw new RuntimeException("TODO");
        }
        if (time == TIME_FUTURE) {
            //todo
            throw new RuntimeException("TODO");
        }
        throw new RuntimeException("Wrong time");
    }


    // time layer

    private LanguageUnit getPresent(int gender, int quantity, int person) {
        if (person == PERSON_FIRST) {
            return getPresentFirst(gender, quantity);
        }
        if (person == PERSON_SECOND) {
            return getPresentSecond(gender, quantity);
        }
        if (person == PERSON_THIRD) {
            return getPresentThird(gender, quantity);
        }
        throw new RuntimeException("Wrong person in present");
    }

    // person layer

    private LanguageUnit getPresentFirst(int gender, int quantity) {
        if (quantity == QUANTITY_SINGULAR) {
            return getPresentFirstSingular(gender);
        }
        if (quantity == QUANTITY_PLURAL) {
            return getPresentFirstPlural(gender);
        }
        throw new RuntimeException("Wrong quantity in present first");
    }

    private LanguageUnit getPresentSecond(int gender, int quantity) {
        if (quantity == QUANTITY_SINGULAR) {
            return getPresentSecondSingular(gender);
        }
        if (quantity == QUANTITY_PLURAL) {
            return getPresentSecondPlural(gender);
        }
        throw new RuntimeException("Wrong quantity in present second");
    }

    private LanguageUnit getPresentThird(int gender, int quantity) {
        if (quantity == QUANTITY_SINGULAR) {
            return getPresentThirdSingular(gender);
        }
        if (quantity == QUANTITY_PLURAL) {
            return getPresentThirdPlural(gender);
        }
        throw new RuntimeException("Wrong quantity in present third");
    }


    // quantity layer

    private LanguageUnit getPresentFirstSingular(int gender){
        if (gender == GENDER_MASCULINE){
            return presentFirstSingularMasculine;
        }
        if (gender == GENDER_FEMININE){
            return presentFirstSingularFeminine;
        }
        throw new RuntimeException("Wrong gender in present first singular");
    }
    
    private LanguageUnit getPresentFirstPlural(int gender){
        if (gender == GENDER_MASCULINE || gender == GENDER_FEMININE){
            return presentFirstPlural;
        }
        throw new RuntimeException("Wrong gender in present first plural");
    } 

    private LanguageUnit getPresentSecondSingular(int gender){
        if (gender == GENDER_MASCULINE){
            return presentSecondSingularMasculine;
        }
        if (gender == GENDER_FEMININE){
            return presentSecondSingularFeminine;
        }
        throw new RuntimeException("Wrong gender in present second singular");
    }

    private LanguageUnit getPresentSecondPlural(int gender){
        if (gender == GENDER_MASCULINE){
            return presentSecondPluralMasculine;
        }
        if (gender == GENDER_FEMININE){
            return presentSecondPluralFeminine;
        }
        throw new RuntimeException("Wrong gender in present second plural");
    }

    private LanguageUnit getPresentThirdSingular(int gender){
        if (gender == GENDER_MASCULINE){
            return presentThirdSingularMasculine;
        }
        if (gender == GENDER_FEMININE){
            return presentThirdSingularFeminine;
        }
        throw new RuntimeException("Wrong gender in present third singular");
    }

    private LanguageUnit getPresentThirdPlural(int gender){
        if (gender == GENDER_MASCULINE){
            return presentThirdPluralMasculine;
        }
        if (gender == GENDER_FEMININE){
            return presentThirdPluralFeminine;
        }
        throw new RuntimeException("Wrong gender in present third plural");
    }




}
