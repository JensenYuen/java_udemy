package Section_3_Control_flow_statements.code_19_LastDigitChecker;

public class LastDigitChecker {
  public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {
    if (isValid(numOne) && isValid(numTwo) && isValid(numThree)) {
      numOne = numOne % 10;
      numTwo = numTwo % 10;
      numThree = numThree % 10;
      if (numOne == numTwo || numOne == numThree || numTwo == numThree) {
        return true;
      }
    }
    return false;
  }
  public static boolean isValid(int number) {
    if (number < 10 || number > 1000) {
      return false;
    }
    return true;
  }
}
