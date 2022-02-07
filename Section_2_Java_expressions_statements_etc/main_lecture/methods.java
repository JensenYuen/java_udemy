package Section_2_Java_expressions_statements_etc.main_lecture;

public class methods {
  public static void main(String[] args) {
    // boolean gameOver = true;
    // int score = 800;
    // int levelCompleted = 5;
    // int bonus = 100;

    int highScore = calcuateScore(true, 800, 5, 100);
    System.out.println("Your score : " + highScore);

    highScore = calcuateScore(true, 10000, 8, 200);
    System.out.println("Your score : " + highScore);

    // challange solution
    int position = calculateHighScorePosition(1500);
    displayHighScorePosition("player1", position);

    position = calculateHighScorePosition(900);
    displayHighScorePosition("player2", position);

    position = calculateHighScorePosition(400);
    displayHighScorePosition("player3", position);

    position = calculateHighScorePosition(50);
    displayHighScorePosition("player4", position);

  }
  public static int calcuateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver == true) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 2000;
      return finalScore;
    } else {
      return -1;
    }
  }
  // challange methods
  public static void displayHighScorePosition(String playerName, int position) {
    // get players name and position as params
    // displays player name along with message
    System.out.println(playerName
                      + " managed to get into position "
                      + position
                      + " on the high score table.");
  }
  public static int calculateHighScorePosition(int playerScore) {
    // get players score as params
    // return int
    // 1 if score > 1000
    // 2 if score is > 500 and < 1000
    // 3 if score is > 100 and < 500
    // 4 if all other scores
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
