package Section_3_Control_flow_statements.main_lecture;

public class ForStatement {
  public static void main(String[] args) {
    for (double interest = 1.0; interest < 9.0; interest+= 1.0) {
      String outputText = "10,000 at " + interest + "% interest is ";
      System.out.println(outputText + String.format("%.2f", calculateInterest(10000,interest)));
    }
    // Working back from 8% to 2% at 2% step
    for (double interest = 8.0; interest > 1.0; interest -= 2.0) {
      String outputText = "10,000 at " + interest + "% interest is ";
      System.out.println(outputText + String.format("%.2f", calculateInterest(10000, interest)));
    }
  }
  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate/100));
  }
}
