package com.gmail.ryitlearning;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList <Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts =  new ArrayList<Contact>();
    }

    private int findContact(Contact contact){
        if (myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.print("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() +
                    " -> " + contact.getPhoneNumber());
        }
    }

    public Contact queryContact(String name) {
        Contact contact = this.myContacts.get(findContact(name));
        if (contact != null) {
            return contact;
        } else {
            return null;
        }
    }

//    public boolean addNewContact(Contact contact) {
//        if (this.myContacts.contains(contact)) {
//            return false;
//        } else {
//            this.myContacts.add(contact);
//            return true;
//        }
//    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exist");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position >= 0) {
            this.myContacts.set(position, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position <0){
            return false;
        } else {
            this.myContacts.remove(position);
            return true;
        }
    }
}
