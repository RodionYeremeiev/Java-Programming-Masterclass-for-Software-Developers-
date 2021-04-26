package com.gmail.ryitlearning;

public class Challenge_4 {
    public static void main(String[] args) {
        /**
         * Challenge #4
         * Replace all occerrences of blank with an Underscore
         * for the following string.
         * Print out the resulting string.
         */

        System.out.println("=====Challenge_#4=======================================");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));
        System.out.println("=========================================================");

    }
}
