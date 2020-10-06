package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(int branchNumber) {
        if (findBranch(branchNumber) == null) {
            this.branches.add(new Branch(branchNumber));
        }
    }

    public void addCustomerToExistingBranch(int branchNumber, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchNumber);
        if (branch != null) {
            branch.addCustomer(customerName, initialTransaction);
        } else {
            System.out.println("Branch not found!");
        }
    }

    public void addTransactionForExistingCustomer(int branchNumber, String customerName, double transaction) {
        Branch branch = findBranch(branchNumber);
        if (branch != null) {
            branch.addTransaction(customerName, transaction);
        } else {
            System.out.println("Branch not found");
        }
    }

    private Branch findBranch(int branchNumber) {
        Branch branch = null;
        for (int i = 0; i < this.branches.size(); i++) {
            branch = this.branches.get(i);
            if (branch.getBranchNumber() == branchNumber) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(int branchNumber, boolean showTransactions) {
        Branch branch = findBranch(branchNumber);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getBranchNumber());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", branches=" + branches.toString() +
                '}';
    }
}
