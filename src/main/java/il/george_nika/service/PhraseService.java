package il.george_nika.service;

import il.george_nika.model.LanguageUnit;
import il.george_nika.model.Phrase;
import il.george_nika.model.pronoun.Pronoun;
import il.george_nika.model.verb.Verb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static il.george_nika.model.ModelConstants.*;

/**
 * Created by George on 11.06.2017.
 */
@Service
public class PhraseService {

    @Autowired
    PronounService pronounService;

    @Autowired
    VerbService verbService;


    public Phrase getPresentPhrase() {
        Pronoun firstPronoun = pronounService.getPronoun();
        Pronoun secondPronoun = pronounService.getPronoun();
        Verb actionVerb = verbService.getActionVerb();
        Verb simpleVerb = verbService.getVerb();

        List<LanguageUnit> summarizedPhrase = new ArrayList<LanguageUnit>();
        summarizedPhrase.add(firstPronoun.getLanguageUnit());
        summarizedPhrase.add(actionVerb.getLanguageUnit(
                firstPronoun.getGender(), firstPronoun.getQuantity(), firstPronoun.getPerson(), TIME_PRESENT));
        summarizedPhrase.add(simpleVerb.getInfinitive());
        summarizedPhrase.add(secondPronoun.getLanguageUnit());
        summarizedPhrase.add(simpleVerb.getLanguageUnit(
                secondPronoun.getGender(), secondPronoun.getQuantity(), secondPronoun.getPerson(), TIME_PRESENT));

        Phrase result = new Phrase();
        result.setLanguageUnit(getSummarizedLanguageUnit(summarizedPhrase));
        return result;
    }

    public Phrase getPastPhrase() {
        //todo
        return getPresentPhrase();
    }

    public Phrase getFuturePhrase() {
        //todo
        return getPresentPhrase();
    }

    public Phrase getWhomPhrase() {
        //todo
        return getPresentPhrase();
    }

    public Phrase getToWhomPhrase() {
        //todo
        return getPresentPhrase();
    }

    public Phrase getWithWhomPhrase() {
        //todo
        return getPresentPhrase();
    }

    public Phrase getWhosePhrase() {
        //todo
        return getPresentPhrase();
    }

    private LanguageUnit getSummarizedLanguageUnit(List<LanguageUnit> languageUnits) {
        LanguageUnit result = new LanguageUnit();
        for (LanguageUnit loopLU : languageUnits) {
            result.addLanguageUnit(loopLU);
        }
        return result;
    }

}
