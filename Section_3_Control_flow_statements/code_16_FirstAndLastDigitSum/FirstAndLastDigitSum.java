package Section_3_Control_flow_statements.code_16_FirstAndLastDigitSum;

public class FirstAndLastDigitSum {
  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    }
    int firstDigit = 0;
    int lastDigit = 0;
    int sum = 0;
    int remainder = 0;
    int reverse = 0;

    lastDigit = number % 10;

    while (number > 0) {
      remainder = number % 10;
      reverse = (reverse * 10) + remainder;
      number = number / 10;
    }

    firstDigit = reverse % 10;
    sum = firstDigit + lastDigit;

    return sum;
  }
}
