package Section_1_Java_basics.Operators_Operands_Expressions;

public class Operators {
  public static void main(String[] args) {
    int result = 1 + 2 ; // 3
    System.out.println(result);

    result -= 2; // 1
    System.out.println(result);

    result *= 10; // 1 * 10 = 10
    System.out.println(result);

    result /= 5; // 10 / 5 = 2
    System.out.println(result);

    result %= 5; // 2 / 5 = reminder 2
    System.out.println(result);

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It's not an alien");
    }

    int topScore = 100;
    if (topScore > 100) {
      System.out.println("Top score!");
    } if (topScore > 50) {
      System.out.println("mid-score!");
    }
    else {
      System.out.println("Didnt get Top score!");
    }
  }
}
