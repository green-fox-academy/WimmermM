package com.greenfoxacademy.tamagochi.controllers;

import com.greenfoxacademy.tamagochi.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GetController {


    List<Fox> foxList = new ArrayList<>();
    Fox myFox;

    @Autowired
    FoxServices myServices;


    @RequestMapping(value = "/login")
    public String login() {


        return "login";
    }


    @PostMapping(value = "/")
    public String foxDisplayName(@RequestParam(value = "name") String name, Model model) {
        Fox myFox = new Fox(name);
        foxList.add(myFox);
        model.addAttribute("myFox", myFox.getName());
        model.addAttribute("tricknumber", myServices.numberOfTricks());


        return "index";
    }

}
