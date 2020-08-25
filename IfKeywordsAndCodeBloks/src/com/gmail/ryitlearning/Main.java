package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        /* Challenge:
        Print out a second score on the screen with the following:
        score set to 10000
        levelCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well
         */

        calculateScore(true, 10000, 8, 200);

//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        calculateScore(newGameOver, newScore, newLevelCompleted, newBonus);
    }

    public static int calculateScore(boolean gameOver,
                                     int score,
                                     int levelCompleted,
                                     int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
