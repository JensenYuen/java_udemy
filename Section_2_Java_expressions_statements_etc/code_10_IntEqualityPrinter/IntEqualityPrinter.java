package Section_2_Java_expressions_statements_etc.code_10_IntEqualityPrinter;

public class IntEqualityPrinter {
  public static void printEqual(int numOne, int numTwo, int numThree) {
    if (numOne < 0 || numTwo < 0 || numThree < 0) {
      System.out.println("Invalid Value");
    } else {
      if (numOne == numTwo && numOne == numThree && numTwo == numThree) {
        System.out.println("All numbers are equal");
      } else if (numOne == numTwo || numOne == numThree || numTwo == numThree) {
        System.out.println("Neither all are equal or different");
      } else {
        System.out.println("All numbers are different");
      }
    }
  }
}
