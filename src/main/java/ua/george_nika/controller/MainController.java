package ua.george_nika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
        model.addAttribute("phrase", phraseService.getRandomPhrase());
        return "main";
    }

    @RequestMapping(value = "random")
    public String random(ModelMap model) {
        model.addAttribute("phrase", phraseService.getRandomPhrase());
        return "main";
    }

    @RequestMapping(value = "/simple")
    public String simple(ModelMap model) {

        model.addAttribute("phrase", phraseService.getSimplePhrase());
        return "main";
    }

    @RequestMapping(value = "/infinitive")
    public String infinitive(ModelMap model) {

        model.addAttribute("phrase", phraseService.getInfinitivePhrase());
        return "main";
    }

    @RequestMapping(value = "/number")
    public String number(ModelMap model) {

        model.addAttribute("phrase", phraseService.getNumberPhrase());
        return "main";
    }

    @RequestMapping(value = "/adjective")
    public String adjective(ModelMap model) {

        model.addAttribute("phrase", phraseService.getAdjectivePhrase());
        return "main";
    }

    @RequestMapping(value = "/own")
    public String own(ModelMap model) {

        model.addAttribute("phrase", phraseService.getOwnPhrase());
        return "main";
    }

    @RequestMapping(value = "/have")
    public String have(ModelMap model) {

        model.addAttribute("phrase", phraseService.getHavePhrase());
        return "main";
    }
}
