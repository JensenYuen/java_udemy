package Section_2_Java_expressions_statements_etc.main_lecture;

public class methodOverloading {
  public static void main(String[] args) {
    calculateScore("playerOne", 500);
    calculateScore(100);
    calculateScore();
    // calling challange methods
    double inchesFeet = calcFeetAndInchesToCentimeters(0, 6);
    System.out.println(inchesFeet);
    double inchOnly = calcFeetAndInchesToCentimeters(157);
    System.out.println(inchOnly);
  }
  public static int calculateScore(String playerName, int score) {
    System.out.println("player "+ playerName + " scored " + score + " points");
    return score*1000;
  }
  public static int calculateScore(int score) {
    System.out.println("unnamed player scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("No player name, no score.");
    return 0;
  }

  //start of challange methods
  public static double calcFeetAndInchesToCentimeters(int inches, int feet) {
    if (feet >=0 && inches >= 0 && inches <= 12) {
      // 1 inch = 2.54cm | 1 foot = 12 inches
      return ((feet * 12 * 2.54) + (inches *2.54));
    }
    System.out.println("Invalid params");
    return -1;
  }

  public static double calcFeetAndInchesToCentimeters(int inches) {
    if (inches >= 0) {
      // 1 inch = 2.54cm | 1 foot = 12 inches
      int foot = inches / 12;
      int reminderInches = inches % 12;
      double calculatedAnswer = calcFeetAndInchesToCentimeters(reminderInches, foot);
      return calculatedAnswer;
    }
    System.out.println("Invalid params");
    return -1;
  }
}
