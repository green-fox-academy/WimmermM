package com.bankofsimba.simba;

import java.text.DecimalFormat;

public class BankAccount {

    String name;
    String balance;
    String anymalType;
    boolean king;
    String status;

    public BankAccount(String name, double balance, String animalType,boolean king,String status) {
        this.name = name;
        this.balance = String.format("%.2f", balance) + " Zebra";
        this.anymalType = animalType;
        this.king = king;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return anymalType;
    }

    public Boolean getKing(){
        return king;
    }

    public String status(){
        return status;
    }
}
