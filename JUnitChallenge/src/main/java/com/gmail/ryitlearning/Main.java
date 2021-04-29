package com.gmail.ryitlearning;

public class Main {
    public static void main(String[] args) {
        Utilities utilities = new Utilities();

        System.out.println(utilities.removePairs("AABCDDEFF"));
        System.out.println(utilities.removePairs("A"));
        System.out.println(utilities.removePairs("AAAAAAAAAAA"));
        System.out.println("---------------------------------------------");
        String charArray = "hello";
        System.out.println(utilities.everyNthChar(charArray.toCharArray(), 2));
    }
}
