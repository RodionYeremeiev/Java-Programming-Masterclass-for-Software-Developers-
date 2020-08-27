package com.gmail.ryitlearning;

public class Main {

    /**
     * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
     *
     * The method should not return any value (hint: void)
     *
     * Using a switch statement print "Sunday", "Monday", ... ,"Saturday" if the int parameter ЃgdayЃh is 0, 1, Ѓc , 6 respectively, otherwise it should print ЃgInvalid dayЃh.
     *
     * Bonus:
     * 	Write a second solution using if then else, instead of using switch.
     * 	Create a new project in IntelliJ with the  name "DayOfTheWeekChallenge"
     */

    public static void main(String[] args) {
        printDayOfWeek(20);
        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

        System.out.println();

        printDayofWeekIfElseIf(20);
        printDayofWeekIfElseIf(-1);
        printDayofWeekIfElseIf(0);
        printDayofWeekIfElseIf(1);
        printDayofWeekIfElseIf(2);
        printDayofWeekIfElseIf(3);
        printDayofWeekIfElseIf(4);
        printDayofWeekIfElseIf(5);
        printDayofWeekIfElseIf(6);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                return;
            case 1:
                System.out.println("Tuesday");
                return;
            case 2:
                System.out.println("Wednesday");
                return;
            case 3:
                System.out.println("Thursday");
                return;
            case 4:
                System.out.println("Friday");
                return;
            case 5:
                System.out.println("Saturday");
                return;
            case 6:
                System.out.println("Sunday");
                return;
            default:
                if (day < 0 || day > 6) {
                    System.out.println("Invalid day");
                }
                break;
        }
    }

    public static void printDayofWeekIfElseIf(int day) {
        if (day < 0 || day > 6) {
            System.out.println("Invalid day");
        } else if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        }
    }
}
