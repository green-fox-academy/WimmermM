package com.greenfox.monday.models;

public class DoUntilSort {

    int result;

    public DoUntilSort() {
    }

    public DoUntilSort(String action, int until) {
        if (action.equals("sum")) {
            result = summ(until);
        } else if (action.equals("factor")) {
            result = factorial(until);
        }
    }

    public int summ(int until) {
        int sum = 0;
        for (int i = 0; i <= until; i++) {
            sum += i;

        }
        return sum;
    }

    public int factorial(int until) {
        int sum = 1;
        for (int i = 1; i <= until; i++) {
            sum = sum * i;

        }
        return sum;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}