package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    Long id;
    String content;

    public Greeting(long id,String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }


}
