package com.paulgules;

public abstract class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highscore is:" + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The highscore is:" + highScore);

        int highScorePosition = calculateHighScorePosition(345);
        displayHighScorePosition("Frank ", highScorePosition);
        highScorePosition = calculateHighScorePosition(902);
        displayHighScorePosition("Alex ", highScorePosition);
        highScorePosition = calculateHighScorePosition(498);
        displayHighScorePosition("Vlad ", highScorePosition);
        highScorePosition = calculateHighScorePosition(45);
        displayHighScorePosition("Vlad ", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
