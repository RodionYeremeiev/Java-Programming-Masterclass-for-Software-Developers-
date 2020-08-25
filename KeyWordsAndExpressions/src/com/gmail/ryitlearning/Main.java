package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

//        a mile is equal to  1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int score = 100;
//        score = 100 in line 15 is the expression
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
//        everything inside {...} from lines 17-20 are th expression

        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("printed");
        }
        myVariable++;
        myVariable--;
        System.out.println("this is a test");

        System.out.println("This is" +
                "another" +
                "still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
