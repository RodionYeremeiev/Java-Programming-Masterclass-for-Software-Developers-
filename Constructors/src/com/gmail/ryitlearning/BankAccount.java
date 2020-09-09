package com.gmail.ryitlearning;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;    // maybe suppose to be something else but String?

    public BankAccount(){
        this(56789, 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public  BankAccount(int accountNumber, double balance,
                        String customerName, String eMail,
                        String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String eMail, String phoneNumber) {
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double depositAmmount){
        this.balance += depositAmmount;
        System.out.println("Deposit of + " + depositAmmount +" made" + " Current ballance is now " + balance);
    }

    public void withdrawFunds(double withdrawalAmmount){
        if (this.balance >= withdrawalAmmount){
            this.balance -= withdrawalAmmount;
            System.out.println("Withdrawal of " + withdrawalAmmount + " processed. Remaining balance = " + balance);
        } else {
            System.out.println("Insufficient Funds! " + this.balance + " available only");
        }
    }
}
