package Section_2_Java_expressions_statements_etc.code_9_MinutesToYearsDaysCalculator;

public class MinutesToYearsDaysCalculator {
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    } else {
      // 1 day = 24hours or 24 * 60mins
      // 1 year = 365 days or 365 * 24hours
      int days = (int)(minutes / (60 * 24));
      int years = days / 365;
      // reminder days
      days = days % 365;
      System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
  }
}
