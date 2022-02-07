package Section_2_Java_expressions_statements_etc.code_8_AreaCalculator;

public class AreaCalculator {
  public static double area(double radius) {
    if (radius < 0) {
      return -1.0;
    }
    double areaOfCircle = Math.PI * Math.pow(radius, 2);
    return areaOfCircle;
  }

  public static double area(double length, double width) {
    if (length < 0 || width < 0) {
      return -1.0;
    }
    double areaOfrectangle = length * width;
    return areaOfrectangle;
  }
}
