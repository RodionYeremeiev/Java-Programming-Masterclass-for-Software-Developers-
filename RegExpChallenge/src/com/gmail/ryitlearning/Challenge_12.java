package com.gmail.ryitlearning;

import java.util.regex.Pattern;

public class Challenge_12 {
    public static void main(String[] args) {
        /**
         * Write a regex that will match a 5-digit US zip code.
         * Use "11111" as your testing string.
         */
        System.out.println("=====Challenge_#12=======================================");
        String zipExample = "11111";
        Pattern pattern = Pattern.compile("^\\d{5}$");
        System.out.println(zipExample.matches(String.valueOf(pattern)));
        System.out.println("=========================================================");

    }
}
