package com.gmail.ryitlearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge_7_8_9_10_11 {
    public static void main(String[] args) {
        /**
         * Challenge #7
         * write a regular expression that will match a string that starts with a series of letters.
         * The letters must be followed be a period. After the period, there must be a series of digits.
         */
        System.out.println("=====Challenge_#7=======================================");

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[a-z]+.[0-9]+$"));
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));
        System.out.println("=========================================================");

        /**
         * Modify the regular expression in challenge 7 to use a group,
         * so that we can print all the digits that occur in a string
         * that contains multiple occurrences of the pattern.
         * write all the code required to accomplish this (create a pattern and matcher, etc.).
         * Use the following string to test your code:
         */
        System.out.println("=====Challenge_#8=======================================");
        String challenge8 = "abcd.135uvqz.7tzik.999";

        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher = pattern.matcher(challenge8);
        while (matcher.find()) {
            System.out.println("Ocurence: " + matcher.group(1));
        }
        System.out.println("=========================================================");

        /**
         * Let's suppose we're reading strings that match the patterns we used
         * in challenge 7 and 8 from a file. Tabs are used to separate matches, with one exception.
         * The last match is followed by a new line. Our revised challenge 8 string would look like this:
         * "abcd.135\tuvqz.7\ttzik.999\n"
         * Revise the regex accordingly and extract all the numbers, as in challenge 8
         */
        System.out.println("=====Challenge_#9=======================================");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println("Ocurence: " + matcher9.group(1));
        }
        System.out.println("=========================================================");


        /**
         * Instead of printing out the numbers themselves, print out their start and end indicies.
         * Use the same string we used for challenge9. Make those indicies inclusive.
         * For example, the start index printed for 135 should be 5, and the end index should be 7.
         * Hint: you will need too look at the documentation for the Matcher.start() and Matcher.end().
         * There's more than one version of these methods.
         */

        System.out.println("=====Challenge_#10=======================================");
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern9.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) - 1));
        }

        System.out.println("=========================================================");

        /**
         * Suppose we have the following string containing points on a graph with in curly braces.
         * Extract what's in the curly braces.
         */
        System.out.println("=====Challenge_#11=======================================");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";

        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }
        System.out.println("=========================================================");

        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while (matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }
        System.out.println("=========================================================");

    }
}
