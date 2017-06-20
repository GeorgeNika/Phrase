package il.george_nika.service;

import il.george_nika.model.LanguageUnit;
import il.george_nika.model.verb.ActionVerb;
import il.george_nika.model.verb.Verb;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George on 16.06.2017.
 */
@Service
public class VerbService {

    private List<Verb> verbs = new ArrayList<Verb>();
    private List<ActionVerb> actionVerbs = new ArrayList<ActionVerb>();

    public Verb getVerb() {
        return verbs.get(0);
    }

    public Verb getActionVerb() {
        return verbs.get(0);
    }

    {
        Verb firstVerb = new Verb();

        firstVerb.setInfinitive(new LanguageUnit("хотеть", "לרצות", "лирцот"));

        firstVerb.setPresentFirstSingularMasculine(new LanguageUnit("хочу", "רוצה", "роце"));
        firstVerb.setPresentFirstSingularFeminine(new LanguageUnit("хочу", "רוצה", "роца"));
        firstVerb.setPresentFirstPlural(new LanguageUnit("хотим", "רוצה", "роцим"));

        firstVerb.setPresentSecondSingularMasculine(new LanguageUnit("хочешь", "רוצה", "роце"));
        firstVerb.setPresentSecondSingularFeminine(new LanguageUnit("хочешь", "רוצה", "роца"));
        firstVerb.setPresentSecondPluralMasculine(new LanguageUnit("хотите", "רוצה", "роцим"));
        firstVerb.setPresentSecondPluralFeminine(new LanguageUnit("хотите", "רוצה", "роцот"));

        firstVerb.setPresentThirdSingularMasculine(new LanguageUnit("хочет", "רוצה", "роце"));
        firstVerb.setPresentThirdSingularFeminine(new LanguageUnit("хочет", "רוצה", "роца"));
        firstVerb.setPresentThirdPluralMasculine(new LanguageUnit("хотят", "רוצה", "роцим"));
        firstVerb.setPresentThirdPluralFeminine(new LanguageUnit("хотят", "רוצה", "роцот"));

        verbs.add(firstVerb);
        actionVerbs.add(new ActionVerb(firstVerb));
    }

}
