package com.gmail.ryitlearning;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 5000, 5, 100);
        System.out.println("your final score was " + highScore);

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        highScore = calculateScore(newGameOver, newScore, newLevelCompleted, newBonus);
        System.out.println("your final score was " + highScore);

//        Challenge:

        displayHighScorePosition("player1", calculateHighScorePosition(1500));
        displayHighScorePosition("player2", calculateHighScorePosition(900));
        displayHighScorePosition("player3", calculateHighScorePosition(400));
        displayHighScorePosition("player4", calculateHighScorePosition(50));

        displayHighScorePosition("player5", calculateHighScorePosition(1000));
        displayHighScorePosition("player6", calculateHighScorePosition(500));
        displayHighScorePosition("player7", calculateHighScorePosition(100));
    }

    public static int calculateScore(boolean gameOver,
                                     int score,
                                     int levelCompleted,
                                     int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position: "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
