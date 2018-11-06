package com.bankofsimba.simba;

import java.text.DecimalFormat;

public class BankAccount {

    String name;
    String balance;
    String anymalType;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = String.format("%.2f", balance) + " Zebra";
        this.anymalType = animalType;
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
}
