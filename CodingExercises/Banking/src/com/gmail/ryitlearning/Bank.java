package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String name){
        Branch branch = null;
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                branch = branches.get(i);
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        } else {
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if (branch!=null ) {
            return branch.newCustomer(customerName, initialTransaction);
        }
       return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch!=null ) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer: " + branchCustomers.get(i).getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int j = 0; j < branchCustomers.get(i).getTransactions().size(); j++) {
                        System.out.println("[" + (j + 1) + "] " + " Amount " + branchCustomers.get(i).getTransactions().get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
