package ua.george_nika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.george_nika.service.SimplePhraseService;

/**
 * Created by user on 16.05.16.
 */

@Controller
public class MainController {

    @Autowired
    SimplePhraseService simplePhraseService;

    @RequestMapping(value = "/")
    public String main(ModelMap model) {

        return "main";
    }

    @RequestMapping(value = "/simple")
    public String simple(ModelMap model) {

        model.addAttribute("phrase", simplePhraseService.getSimplePhrase());
        return "simple";
    }
}
