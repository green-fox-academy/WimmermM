package com.greenfox.todo.controllers;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/todo")
public class Controllers implements CommandLineRunner {


    @Autowired
    TodoFace myFace;



    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {

        model.addAttribute("todo",myFace.findAll());

        return "todolist";
    }


    @Override
    public void run(String... args){
//        myFace.save(new Todo("Wash dishes"));
//        myFace.save(new Todo("Play World of Warcraft"));
//        myFace.save(new Todo("Dont play diablo immortal"));
//        myFace.save(new Todo("Baba Jaga"));
    }
}
