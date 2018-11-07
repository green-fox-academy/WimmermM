package com.exercise.exercise1.controllers;

import com.exercise.exercise1.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {

    @Autowired
    UtilityService myRandomColor;

    @RequestMapping(value = "/useful")
    public String utilities(Model model) {

        model.addAttribute("homepage", "http://localhost:8080/useful/colored");
        model.addAttribute("link2","http://localhost:8080/useful/email");
        return "model";
    }

    @RequestMapping(value = "/useful/colored")
    public String colors(Model model) {


        model.addAttribute("color", myRandomColor.randomColor());

        return "colored";
    }

    @RequestMapping(value = "/useful/email")
    public String emailValidator(@RequestParam (value = "email")String email,Model model){
        model.addAttribute("checkEmail",myRandomColor.validateEmail(email));

        return "email-validation";
    }

}
