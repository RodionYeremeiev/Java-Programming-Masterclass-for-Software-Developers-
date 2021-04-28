package com.gmail.ryitlearning;

public class BankAccount {
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private String firstName;
    private String lastName;
    private double balance;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    public static int getSAVINGS() {
        return SAVINGS;
    }

    /**
     * The Branch argument is true if the customer
     * is performing the transaction at a branch, with a letter.
     * It's false if the customer is performing the transaction at an ATM
     */
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    /**
     * The Branch argument is true if the customer
     * is performing the transaction at a branch, with a letter.
     * It's false if the customer is performing the transaction at an ATM
     */
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }
}

