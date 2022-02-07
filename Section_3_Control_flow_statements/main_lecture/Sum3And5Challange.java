package Section_3_Control_flow_statements.main_lecture;

public class Sum3And5Challange {
  public static void main(String[] args) {
    // sum all numbers that can be divided by 3 and 5
    int sum = 0;
    int count = 0;
    // For statement using a range from 1 to 1000
    for (int i = 1; i < 1000; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        // print the numbers that meet the condition
        System.out.println("Number dividable by both 3 and 5 : " + i);
        // stop after finding 5 numbers that meet the condition
        sum += i;
        count++;
      }
      if (count == 5) {
        break;
      }
    }
    System.out.println("Sum of numbers dividable by both 3 and 5 : " + sum);

    System.out.println("Programn has stopped");
  }
}
