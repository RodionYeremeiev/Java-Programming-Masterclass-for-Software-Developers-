package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Branch {
    public int branchNumber;
    private ArrayList<Customer> customers;

    public Branch(int branchNumber) {
        this.branchNumber = branchNumber;
        this.customers = new ArrayList<Customer>();
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Branch #" + branchNumber
                + ", helds " + customers.size() + " customer(s)";
    }

    private Customer getCustomer(String name) {
        Customer customer = null;
        for (int i = 0; i < this.customers.size(); i++) {
            customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    private Customer getCustomer(Customer existingCustomer) {
        if (customers.contains(existingCustomer)) {
            return existingCustomer;
        }
        return null;
    }

    public void addCustomer(String customerName, double initialTransaction) {
        if (getCustomer(customerName) != null) {
            System.out.println("Customer already exist");
        } else {
            this.customers.add(new Customer(customerName, initialTransaction));
        }
    }

    public void addCustomer(Customer customer) {
        if (getCustomer(customer) != null) {
            System.out.println("Customer already exist");
        } else {
            this.customers.add(customer);
        }
    }

    public void addTransaction(String customerName, double amount) {
        Customer existingCustomer = getCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
        } else {
            System.out.println("Customer not found");
        }

    }

//    public void showCustomers(){
//
//    }

//    @Override
    public String showCustomers() {
        return "Branch{" +
                "branchNumber=" + branchNumber +
                ", customers=" + customers +
                '}';
    }
}
