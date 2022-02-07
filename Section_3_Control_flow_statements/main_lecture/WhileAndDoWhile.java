package Section_3_Control_flow_statements.main_lecture;

public class WhileAndDoWhile {
  public static void main(String[] args) {
    int number = 4;
    int finishNumber = 20;
    int count = 0;
    int sum = 0;
    while (number <= finishNumber) {
      number ++;
      if (isOddNumber(number)) {
        continue;
      }
      System.out.println("Even number :" + number);
      count += 1;
      sum += number;
      if (count == 5) {
        break;
      }
    }
    System.out.println("Sum of first 5 even numbers : " + sum);
    // modify the while code above
    // so that it records total number of even numbers
    // break after finding 5
    // display total number of even numbers.
  }
  // Create a method called isEvenNumber
  // Takes parameter int
  // true if even, false if odd
  public static boolean isOddNumber(int number) {
    if ((number % 2) == 1) {
      return true;
    }
    return false;
  }
}
