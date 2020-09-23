package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] baseData = new int[10];
    private static GroceryList groceryList = new GroceryList();

    public static void printArray(int[] array) {
        System.out.print("array: [");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.print(array[j] + "; ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = sc.nextInt();
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static void main(String[] args) {
        // write your code here
//        System.out.println("Enter 10 integers");
//        getInput();
//        System.out.print("original ");
//        printArray(baseData);
//        resizeArray();
//        System.out.print("resized ");
//        printArray(baseData);
//        baseData[baseData.length-1] = 34;
//        baseData[baseData.length-2] = 67;
//        System.out.print("added elements to resized ");
//        printArray(baseData);

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choise ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item to the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter item number: ");
        int itemNumber = sc.nextInt() - 1;
        sc.nextLine();
        System.out.println("Please enter reolacement item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter item number: ");
        int itemNumber = sc.nextInt() - 1;
        sc.nextLine();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.println("Please enter item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in your grocery list");
        } else {
            System.out.println(searchItem + " is not in your grocery list");
        }
    }

}
