package Section_2_Java_expressions_statements_etc.code_1_SpeedConverter;

public class SpeedConverter {
  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    } else {
      long milePerHour = Math.round(kilometersPerHour / 1.609);
      return milePerHour;
    }
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      long milePerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + " km/h = " + milePerHour + " mi/h");
    }
  }
}
