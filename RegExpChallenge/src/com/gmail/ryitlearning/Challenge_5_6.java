package com.gmail.ryitlearning;

public class Challenge_5_6 {
    public static void main(String[] args) {
        /**
         * Challenge #5
         * Write a regular expression that will match the following string entirely.
         * Use the String.matches() method to verify your answer.
         */

        System.out.println("=====Challenge_#5=======================================");

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches(".*"));
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println("=========================================================");

        /**
         * Challenge #6
         * Write a regular expression that will only match
         * challenge #5 string in it's entirety.
         */
        System.out.println("=====Challenge_#6=======================================");
        System.out.println(challenge5.matches("a{3}b{1}c{8}d{3}e{1}f{3}g{1}"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println("=========================================================");

    }
}
