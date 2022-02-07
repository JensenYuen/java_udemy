package Section_3_Control_flow_statements.main_lecture;

public class DigitSumChallange {
  public static void main(String[] args) {
    int sum = sumDigits(999);
    System.out.println(sum);
  }
  public static int sumDigits(int number) {
    if (number <= 10) {
      return -1;
    }
    int hund = number / 100;
    int tens = (number % 100 ) / 10;
    int ones = (number % 100 ) % 10;
    int sum = hund + tens + ones;
    return sum;
  }
}
