package com.gmail.ryitlearning;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Main {

    public static void main(String[] args) {
        // write your code here
//        Bank bank = new Bank("Central");
//        System.out.println(bank.toString());
//
//        bank.addBranch(1);
//        bank.addBranch(2);
//        bank.addBranch(3);
//
//        System.out.println(bank.toString());
//
//        Customer customerOne = new Customer("Josh", 200);
//        System.out.println(customerOne.toString());
//        customerOne.addTransaction(102);
//        customerOne.addTransaction(300);
//        customerOne.addTransaction(-400);
//        System.out.println(customerOne.toString());
//
////        bank.findBranch(3).addCustomer(customerOne);
//
////        System.out.println(bank.findBranch(3).showCustomers());
//
//        System.out.println(bank.toString());
//
//        bank.addCustomerToExistingBranch(1, "Timmy", 25.50);
//        System.out.println(bank.toString());
//
//        bank.addTransactionForExistingCustomer(1, "Timmy", 712.89);
//
//        System.out.println(bank.toString());
//
////        System.out.println(bank.findBranch(1).showCustomers());

        Bank bank = new Bank("Central");

        bank.addBranch(1);

        bank.addCustomerToExistingBranch(1, "Tim", 50.05);
        bank.addCustomerToExistingBranch(1, "Mike", 175.34);
        bank.addCustomerToExistingBranch(1, "Percy", 220.12);

        bank.addBranch(2);
        bank.addCustomerToExistingBranch(2, "Bob", 150.45);

        bank.addTransactionForExistingCustomer(1, "Tim", 44.22);
        bank.addTransactionForExistingCustomer(1, "Tim", 12.44);
        bank.addTransactionForExistingCustomer(1, "Mike", 1.65);

        bank.listCustomers(1, false);
        bank.listCustomers(1, true);

        bank.listCustomers(2, true);

    }
}
