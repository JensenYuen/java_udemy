package Section_3_Control_flow_statements.code_15_NumberPalindrome;

public class NumberPalindrome {
  public static boolean isPalindrome(int number) {
    int lastDigit = 0;
    int reverse = 0;
    int temp = 0;

    if (number < 0) {
      number = number * -1;
    }

    temp = number;
    while(number > 0){
      lastDigit = number%10;  //getting remainder
      reverse = (reverse * 10) + lastDigit;
      number = number / 10;
    }
    if(temp == reverse) {
      return true;

    } else {
      return false;

    }
  }
}
