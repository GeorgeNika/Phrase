package il.george_nika.controller;

import il.george_nika.model.Phrase;
import il.george_nika.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by George on 11.06.2017.
 */
@Controller
public class MainController {

    @Autowired
    PhraseService phraseService;

    @RequestMapping(value = "/")
    public String main(ModelMap model) {
        return "main";
    }

    @RequestMapping(value = "/ajax/phrase")
    @ResponseBody
    public Phrase getAjaxPhrase(String phraseType){
        return phraseService.getPresentPhrase();
    }
}
