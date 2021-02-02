package udemy.challenges.Java;

public class HighScore {
    public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    calculateScore(gameOver, score, levelCompleted, bonus);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    calculateScore(gameOver, score, levelCompleted, bonus);

    int highScorePosition = calculateHighscorePosition(1500);
    displayHighScorePosition("Tesse", highScorePosition);

    highScorePosition = calculateHighscorePosition(900);
    displayHighScorePosition("Floere", highScorePosition);

    highScorePosition = calculateHighscorePosition(400);
    displayHighScorePosition("Miet", highScorePosition);

    highScorePosition = calculateHighscorePosition(1000);
    displayHighScorePosition("Elise", highScorePosition);


}
    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        //calculateHighscorePosition(highScorePosition);
        System.out.println(playersName + " managed to get in position " + highScorePosition + " on the high score table");
    }
    public static int calculateHighscorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

}

