package com.maicolflorez.walletapp;

public class Account {

    private String name;

    public Account(String name, String type, Double currentValue) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
    }

    private String type;
    private Double currentValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }
}
