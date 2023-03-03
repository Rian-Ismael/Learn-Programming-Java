package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {


    int highScore = calculateScore(false, 800, 5, 100);
    System.out.println("Your second final score was " + highScore);

    highScore = calculateScore(true, 10000, 8, 200);
    System.out.println("Your second final score was " + highScore);


    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim",highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Bob", highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Percy", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Gilbert", highScorePosition);
    }


    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;

        } else {
            return -1;
        }
        // or return -1, without "else".

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playScore) {
//        if (playScore >= 1000) {
//            return 1;
//        } else if (playScore >= 500) {
//            return 2;
//        } else if (playScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4; // assuming position 4 will be returned

        if (playScore >= 1000) {
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        } else if (playScore >= 100) {
            position = 3;
        }
        return position;
    }
}