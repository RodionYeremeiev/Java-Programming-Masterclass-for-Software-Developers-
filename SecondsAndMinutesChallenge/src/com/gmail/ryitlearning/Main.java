package com.gmail.ryitlearning;

public class Main {

    /**
     * Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
     * <p>
     * You should validate that the first parameter minutes is >= 0.
     * <p>
     * You should validate that the 2nd parameter seconds is >= 0 and <= 59.
     * <p>
     * The method should return "Invalid value" in the method if either of the above are not true.
     * <p>
     * If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds
     * passed to this method and return that value as string in format "XXh YYm ZZs"
     * where XX represents a number of hours, YY the minutes and ZZ the seconds.
     * <p>
     * Create a 2nd method of the same name but with only one parameter seconds.
     * <p>
     * Validate that it is >= 0, and return "Invalid value" if it is not true.
     * <p>
     * If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
     * passing the correct minutes and seconds calculated so that it can calculate correctly.
     * <p>
     * Call both methods to print values to the console.
     * <p>
     * Tips:
     * Use int or long for your number data types is probably a good idea.
     * 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
     * Methods should be static as we have used previously.
     * <p>
     * Bonus:
     * For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s
     * (Tip: use if-else)
     * Create a new console project and call it SecondsAndMinutesChallenge
     */
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

//        System.out.println(getDurationString(367,50));
        getDurationString(65, 9);
        getDurationString(3909);
        getDurationString(456, 650);
        getDurationString(-985);

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String result = addLeadingZero(hours, remainingMinutes, seconds);
        System.out.println(result);
        return result;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String addLeadingZero(int hours, int minutes, int seconds) {
        if ((hours < 0) || (minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        String result = hoursString + " " + minutesString + " " + secondsString;
        return result;
    }
}
