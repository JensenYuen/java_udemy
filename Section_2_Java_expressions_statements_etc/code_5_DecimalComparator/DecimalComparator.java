package Section_2_Java_expressions_statements_etc.code_5_DecimalComparator;

public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double numOne,double numTwo) {
    int numOnerounded = (int)(numOne * 1000);
    int numTworounded = (int)(numTwo * 1000);

    if (numOnerounded == numTworounded) {
      return true;
    }
    return false;
  }
}
