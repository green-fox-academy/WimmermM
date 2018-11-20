package com.greenfox.monday.models;

public class MyAppend {

    String appended;


    public MyAppend() {
    }

    public MyAppend(String appended) {
        this.appended = appended.concat("a");
    }



    public String getAppended() {
        return appended;
    }

    public void setAppend(String appended) {
        this.appended = appended;
    }
}
