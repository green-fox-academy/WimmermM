package com.greenfox.monday.controllers;


import com.greenfox.monday.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {

        if (input == null){

            return new MyErrorClass("Please provide an input!");
        }


        return new Doubling(input);

    }

    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title" , required = false)String title){

        if (name == null || title == null){

            return new MyErrorClass("Please provide a name!");
        }
        return new MyGreeter(name,title);
    }


    @GetMapping(value = "/appenda/{appenda}")
    public Object myAppenda(@PathVariable String appenda){

        return new MyAppend(appenda);
    }

    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@PathVariable String action , @RequestBody Dountil dountil){
        if (dountil.getUntil() == 0){

            return new MyErrorClass("Please provide a number!");
        }


        return new DoUntilSort(action,dountil.getUntil());
    }

}
