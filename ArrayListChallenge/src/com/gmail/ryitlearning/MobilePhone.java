package com.gmail.ryitlearning;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exist");
        }
        myContacts.add(contact);
        System.out.println("Contact " + contact.getName() + " added.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println("Contact" + oldContact.getName() + " not found");
            return false;
        } else if(findContact(newContact.getName())!=-1) {
            System.out.println("Contact with name"+newContact.getName()+
                    " already exists. Update was not successful.");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        System.out.println("Contact " + oldContact.getName() + " replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void removeContact(Contact contactToRemove) {
        if (myContacts.contains(contactToRemove)) {
            myContacts.remove(myContacts.indexOf(contactToRemove));
            System.out.println("Contact: " + contactToRemove.getName() + " deleted");

        } else {
            System.out.println("Contact: " + contactToRemove.getName() + " not found");
        }
    }

    public void printContactList() {
        if (myContacts.size() == 0) {
            System.out.println("Your contact list is empty.");
        } else {
            System.out.println("You got " + this.myContacts.size() + " in your list:");
            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() +
                        "\nphone number: " + this.myContacts.get(i).getPhoneNumber());
            }
        }
    }
}
