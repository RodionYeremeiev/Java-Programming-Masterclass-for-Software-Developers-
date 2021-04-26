package com.gmail.ryitlearning;

import java.util.regex.Pattern;

public class Challenge_14 {
    public static void main(String[] args) {
        /**
         * Write a regex that will match a 5-digit US zip codes,
         * and zip codes that contain the optional 4 digits preceded by a dash.
         */
        System.out.println("=====Challenge_#14=======================================");
        String FiveDigitZipCodeExample = "11111";
        String FiveDigitDashAdditionalFourDigitZipCode = "11111-1111";
        Pattern pattern = Pattern.compile("^\\d{5}(-\\d{4})?$");
        System.out.println(FiveDigitZipCodeExample.matches(String.valueOf(pattern)));
        System.out.println(FiveDigitDashAdditionalFourDigitZipCode.matches(String.valueOf(pattern)));
        System.out.println("=========================================================");

    }
}
