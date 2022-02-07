package Section_4_OOP_Part_1.coding_29_SumCalculator;

public class SimpleCalculator {
  private double firstNumber;
  private double secondNumber;

  public double getFirstNumber() {
    return firstNumber;
  }
  public double getSecondNumber() {
    return secondNumber;
  }
  public void setFirstNumber(double number) {
    this.firstNumber = number;
  }
  public void setSecondNumber(double number) {
    this.secondNumber = number;
  }
  public double getAdditionResult() {
    return firstNumber + secondNumber;
  }
  public double getSubtractionResult() {
    return firstNumber - secondNumber;
  }
  public double getMultiplicationResult() {
    return firstNumber * secondNumber;
  }
  public double getDivisionResult() {
    if (this.secondNumber == 0) {
      return 0;
    }
    return firstNumber / secondNumber;
  }
}
