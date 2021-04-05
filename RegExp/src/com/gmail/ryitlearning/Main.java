package com.gmail.ryitlearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am, a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I am", "You are");
        System.out.println(yourString);

        String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(alphaNumeric.replaceAll(".", "Y"));
//
//        System.out.println(alphaNumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDeee"));
        System.out.println(alphaNumeric.matches("abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphaNumeric.replaceAll("ijkl99z$", "THE END"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "x"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "I replaced"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "<X>"));
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "<X>"));
        System.out.println(newAlphaNumeric.replaceAll("[a-fA-F3-8]", "<X>"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "<X>"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "<Z>"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "<Z>"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "<Z>"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
        System.out.println(newAlphaNumeric.replaceAll("\\w", "<T>"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "<T>"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "<T>"));

//        String thirdAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        String thirdAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("^abcDe{2,5}", "YYY"));
        System.out.println(thirdAlphaNumeric.replaceAll("h+i*j", "={Y}="));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is a paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurence: " + groupMatcher.group(1));
        }
        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }

    }
}
