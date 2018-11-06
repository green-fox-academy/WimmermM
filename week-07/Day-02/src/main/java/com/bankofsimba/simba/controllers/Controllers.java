package com.bankofsimba.simba.controllers;

import com.bankofsimba.simba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Controllers {


    @RequestMapping(value = "/show")
    public String bankAccount(Model model) {

        BankAccount simba = new BankAccount("Simba", 2000, "lion",true,"true");
        model.addAttribute("name", simba.getName());
        model.addAttribute("balance", simba.getBalance());
        model.addAttribute("animal", simba.getAnimalType());

        return "model";
    }


    @RequestMapping(value = "/enjoy")
    public String enjoy(Model model) {
        model.addAttribute("stringText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "exercise3";
    }


    @RequestMapping(value = "/users")
    public String usersList(Model model) {
        List<BankAccount> mylist = new ArrayList<>();
        mylist.add(new BankAccount("Rafiki", 5000, "monkey",false,"true"));
        mylist.add(new BankAccount("Simba", 2000, "lion",true,"true"));
        mylist.add(new BankAccount("Gopher", 1000, "hyena",false,"true"));
        mylist.add(new BankAccount("Timon", 3000, "meerkat",false,"true"));
        mylist.add(new BankAccount("Pumbaa", 4000, "warthog",false,"false"));

        model.addAttribute("list",mylist);


        return "tableModel";
    }



}
