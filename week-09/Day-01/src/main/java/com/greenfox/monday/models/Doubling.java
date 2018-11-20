package com.greenfox.monday.models;

public class Doubling {

    int received;
    int result;

    public int getReceived() {
        return received;
    }

    public Doubling() {
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }
}
