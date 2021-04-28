package com.gmail.ryitlearning;


import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void deposit() {
        BankAccount account = new BankAccount("Rod", "Y", 1000.0, BankAccount.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Rod", "Y", 1000.0, BankAccount.CHECKING);
        account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Rod", "Y", 1000.0, BankAccount.CHECKING);
        account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0);
    }


    @Test
    public void isChecking() {
        BankAccount account = new BankAccount("Rod", "Y", 1000.0, BankAccount.CHECKING);
//        assertEquals(true, account.isChecking());
        assertTrue("The account is NOT checking account", account.isChecking());
    }
}