package com.greenfoxacademy.tamagochi.controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxServices {

    ArrayList<String> tricks;


    public FoxServices() {
        tricks = new ArrayList<>();
    }

    public int numberOfTricks(){
        int count = 0;
        for (int i = 0; i < tricks.size(); i++) {
            count ++;

        }

        return  count;
    }
}
