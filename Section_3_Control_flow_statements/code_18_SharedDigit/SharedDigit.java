package Section_3_Control_flow_statements.code_18_SharedDigit;

public class SharedDigit {
  public static boolean hasSharedDigit(int numOne, int numTwo) {
    if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99 ) {
      return false;
    }
    int numOneRemainder = numOne % 10;
    numOne = numOne / 10;
    int numTwoRemainder = numTwo % 10;
    numTwo = numTwo / 10;
    if (numOne == numTwo || numOne == numTwoRemainder || numOneRemainder == numTwo || numOneRemainder == numTwoRemainder) {
      return true;
    }
    return false;
  }
}
