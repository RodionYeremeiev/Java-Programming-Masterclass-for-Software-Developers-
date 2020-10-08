package com.gmail.ryitlearning;

import java.util.ArrayList;

public class Main {
    private static void printArrayList(ArrayList arrayList) {
        System.out.println("-------------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ": " + arrayList.get(i));
        }
        System.out.println("-------------------------");

    }

    public static void main(String[] args) {
        // write your code here

        Customer customer = new Customer("Jerry", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " = " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        printArrayList(intList);
        intList.add(1, 2);

        printArrayList(intList);

    }
}
