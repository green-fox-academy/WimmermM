package com.greenfox.monday.models;

public class MyGreeter {


    String welcome_message;


    public MyGreeter() {
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public MyGreeter(String name, String title) {
        welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";

    }


}
