package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        Customer customer = null;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                customer = customers.get(i);
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) {
            return false;
        } else {
//            Customer customer = new Customer(name, initialTransaction);
            this.customers.add(new Customer(name, initialTransaction));
            return true;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
//            customers.set(customers.indexOf(findCustomer(name)), customer);
            return true;
        }
        return false;
    }
}
