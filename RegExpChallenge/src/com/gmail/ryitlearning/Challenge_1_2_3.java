package com.gmail.ryitlearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_1_2_3 {
    public static void main(String[] args) {
        /**
         challenge #1
         write the string literal regular expression that will match
         the following String.
         Use the String.matches() method to verify the answer.
         */
        System.out.println("=====Challenge_#1=======================================");
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));
        System.out.println("=========================================================");

        /**
         * Challenge #2
         * Write a regular expression that will match
         * "I want a bike." and "I want a ball."
         * Verify your answer using the matches() method.
         */
        System.out.println("=====Challenge_#2=======================================");
        String challenge2 = "I want a ball.";
        // impl 1
        Pattern pattern = Pattern.compile("I want a (bike|ball).$");
        System.out.println(challenge1.matches(pattern.pattern()));
        System.out.println(challenge2.matches(pattern.pattern()));

        // impl 2
        Pattern pattern2 = Pattern.compile("I want a \\w+.");
        System.out.println(challenge1.matches(pattern2.pattern()));
        System.out.println(challenge2.matches(pattern2.pattern()));
        System.out.println("=========================================================");

        /**
         * Challenge #3
         * Update Challenge #2 to check for matches using Matcher.matches,
         * instead of String.matches(), for the regexp that uses \w+.
         * You'll have to compile a pattern.
         */
        System.out.println("=====Challenge_#3=======================================");

        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher.reset();
        matcher = pattern2.matcher(challenge2);
        System.out.println(matcher.matches());
        System.out.println("=========================================================");


    }
}
