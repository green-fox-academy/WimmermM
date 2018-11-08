package com.greenfoxacademy.tamagochi.controllers;
import com.greenfoxacademy.tamagochi.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GetController {


    List<Fox>foxList = new ArrayList<>();


//    @PostMapping(value = "/")
//    @ResponseBody
//    public String test() {
//
//        return "redirect:/";
//    }

    @RequestMapping(value = "/login")
    public String login(String test,Model model) {
        model.addAttribute("name",test);


        return "login";
    }


    @RequestMapping(value = "/")
    public String foxDisplayName(@RequestParam(value = "name") String name, Model model) {
        Fox myFox = new Fox(name);
        foxList.add(myFox);
        model.addAttribute("myFox",myFox.getName());


        return "index";
    }
}
