package ua.george_nika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.george_nika.model.ThreeString;
import ua.george_nika.service.PhraseService;

/**
 * Created by user on 16.05.16.
 */

@Controller
public class MainController {

    @Autowired
    PhraseService phraseService;

    @RequestMapping(value = "/")
    public String main(ModelMap model) {
        fillModel(model, phraseService.getRandomPhrase());
        return "main";
    }

    @RequestMapping(value = "random")
    public String random(ModelMap model) {
        fillModel(model, phraseService.getRandomPhrase());
        return "main";
    }

    @RequestMapping(value = "/simple")
    public String simple(ModelMap model) {

        fillModel(model, phraseService.getSimplePhrase());
        return "main";
    }

    @RequestMapping(value = "/infinitive")
    public String infinitive(ModelMap model) {

        fillModel(model, phraseService.getInfinitivePhrase());
        return "main";
    }

    @RequestMapping(value = "/number")
    public String number(ModelMap model) {

        fillModel(model, phraseService.getNumberPhrase());
        return "main";
    }

    @RequestMapping(value = "/adjective")
    public String adjective(ModelMap model) {

        fillModel(model, phraseService.getAdjectivePhrase());
        return "main";
    }

    @RequestMapping(value = "/own")
    public String own(ModelMap model) {

        fillModel(model, phraseService.getOwnPhrase());
        return "main";
    }

    @RequestMapping(value = "/have")
    public String have(ModelMap model) {

        fillModel(model, phraseService.getHavePhrase());
        return "main";
    }
    @RequestMapping(value = "/question")
    public String question(ModelMap model) {
        fillModel(model, phraseService.getQuestion());
        return "main";
    }
    @RequestMapping(value = "/adverb")
    public String adverb(ModelMap model) {

        fillModel(model, phraseService.getAdverbs());
        return "main";
    }


    private void fillModel(ModelMap model, ThreeString entity){
        model.addAttribute("phraseRussian", entity.getRussian());
        model.addAttribute("phraseTranslate", entity.getTranslate());
        model.addAttribute("phraseTranscription", entity.getTranscription());
    }
}
