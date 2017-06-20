package il.george_nika.model.pronoun;

import il.george_nika.model.LanguageUnit;
import lombok.Data;

/**
 * Created by George on 16.06.2017.
 */

@Data
public class Pronoun {

    private LanguageUnit languageUnit;

    private int gender;
    private int quantity;
    private int person;

    public Pronoun() {
    }

    public Pronoun(LanguageUnit languageUnit, int gender, int quantity, int person) {
        this.languageUnit = languageUnit;
        this.gender = gender;
        this.quantity = quantity;
        this.person = person;
    }
}
