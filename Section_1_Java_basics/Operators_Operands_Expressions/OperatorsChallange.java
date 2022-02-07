package Section_1_Java_basics.Operators_Operands_Expressions;

public class OperatorsChallange {
  public static void main(String[] args) {
    double firstVar = 20.00;
    double secondVar = firstVar * 4;
    double varTotal = (firstVar + secondVar) * 100;

    double reminder = varTotal % 40.0;

    boolean isRemainderZero = (reminder == 0 )? true : false;
    System.out.println(isRemainderZero);

    if (!isRemainderZero) {
      System.out.println("Got some remainder");
    }
  }
}
