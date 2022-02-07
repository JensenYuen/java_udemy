package Section_2_Java_expressions_statements_etc.code_6_EqualSumChecker;

public class EqualSumChecker {
  public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
    if ((numOne+numTwo) == numThree) {
      return true;
    }
    return false;
  }
}
