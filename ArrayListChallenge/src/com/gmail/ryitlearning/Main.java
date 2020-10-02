package com.gmail.ryitlearning;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("5555-555-5555");
    ;


    public static void main(String[] args) {
        // write your code here
        startPhone();
        boolean quit = false;
        printInstructions();
        while (!quit) {
            System.out.println("Please enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    shutDownPhone();
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    System.out.println("Enter new contact name");
                    String name = sc.nextLine();
                    System.out.println("Enter new contact phone number");
                    String number = sc.nextLine();
                    mobilePhone.addNewContact(Contact.createContact(name, number));
                    break;
                case 3:
                    System.out.println("Enter existing contact name");
                    Contact existingContact = mobilePhone.queryContact(sc.nextLine());
                    System.out.println("Enter new contact name");
                    String newName = sc.nextLine();
                    System.out.println("Enter new contact phone number");
                    String newNumber = sc.nextLine();
                    Contact newContact = Contact.createContact(newName, newNumber);
                    mobilePhone.updateContact(existingContact, newContact);
                    break;
                case 4:
                    System.out.println("Enter contact name to delete contact");
                    String nameToDelete = sc.nextLine();
                    mobilePhone.removeContact(mobilePhone.queryContact(nameToDelete));
                    break;
                case 5:
                    System.out.println("Enter contact name to find");
                    String nameToFind = sc.nextLine();
                    if (mobilePhone.queryContact(nameToFind) != null) {
                        System.out.println("Contact is present");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void shutDownPhone() {
        System.out.println("Shutting down...");
    }

    private static void printInstructions() {
        System.out.println("\nAvailable actions:\nPress ");
        System.out.println("0 - to shut down\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to query if an existing contact present\n" +
                           "6 - to print a list of available actions.");
        System.out.println("Chose your action");
    }

}
