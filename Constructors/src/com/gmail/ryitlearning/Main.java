package com.gmail.ryitlearning;

public class Main {
    /**
     * Challenge:
     * Create a new class for a bank account
     * Create fields for the account number, balance, customer name, email and phone number.
     *
     * Create getters and setters for each field
     * Create two additional methods
     *    1. To allow the customer to deposit funds (this should increment the balance field).
     *    2. To allow the customer to withdraw funds. This should deduct from the balance field,
     * but not allow the withdrawal to complete if their are insufficient funds.
     * You will want to create various code in the Main class (the one created by IntelliJ) to
     * confirm your code is working.
     * Add some System.out.println's in the two methods above as well.
     */

    public static void main(String[] args) {

//	BankAccount account = new BankAccount();

	BankAccount jimsAccount = new BankAccount();//32154, 0.0, "Jim Hawkings", "jollyroger@treasure.com", "(087) 123-4567");

	jimsAccount.setAccountNumber(132456);
	jimsAccount.setBalance(0);


        System.out.println("Ballance = " + jimsAccount.getBalance());
        jimsAccount.withdrawFunds(4000);
        System.out.println("Ballance = " + jimsAccount.getBalance());
        jimsAccount.depositFunds(200.23);
        System.out.println("Ballance = " + jimsAccount.getBalance());
        jimsAccount.withdrawFunds(500);
        System.out.println("Ballance = " + jimsAccount.getBalance());
        jimsAccount.withdrawFunds(100);
        System.out.println("Ballance = " + jimsAccount.getBalance());
        jimsAccount.withdrawFunds(100.22999999999999);
        System.out.println("Ballance = " + jimsAccount.getBalance());

    }
}
