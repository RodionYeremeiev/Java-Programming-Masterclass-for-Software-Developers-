package com.gmail.ryitlearning;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String eMailAdress;

    public VipCustomer() {
        this("default name", 0.0, "default@mail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@mail.com");
    }

    public VipCustomer(String name, double creditLimit, String eMailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAdress = eMailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAdress() {
        return eMailAdress;
    }
}
