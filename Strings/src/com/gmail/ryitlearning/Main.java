package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {
        /** Primitive types:
         *  byte;
         *  short;
         *  int;
         *  long;
         *  float;
         *  double;
         *  char;
         *  boolean.
         * */
        String mySstring = "This is a string";
        System.out.println("myString is equals to " + mySstring);
        mySstring = mySstring + ", and this is more.";
        System.out.println("myString is equals to " + mySstring);
        mySstring = mySstring + " \u00A9 2019";
        System.out.println("myString is equals to " + mySstring);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
