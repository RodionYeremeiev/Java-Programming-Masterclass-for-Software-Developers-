package com.gmail.ryitlearning;

import java.util.regex.Pattern;

public class Challenge_13 {
    public static void main(String[] args) {
        /**
         * US zip codes can be followed by a dash and another four numbers.
         * Write a regex taht will match those zip codes.
         * Use "11111-1111" as your testing string.
         */
        System.out.println("=====Challenge_#13=======================================");
        String zipExample = "11111-1111";
        Pattern pattern = Pattern.compile("^\\d{5}-\\d{4}$");
        System.out.println(zipExample.matches(String.valueOf(pattern)));
        System.out.println("=========================================================");

    }
}
