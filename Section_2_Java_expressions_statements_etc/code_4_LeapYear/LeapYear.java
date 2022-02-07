package Section_2_Java_expressions_statements_etc.code_4_LeapYear;

public class LeapYear {
  public static boolean isLeapYear(int year) {
    if (year >= 1 && year <= 9999) {
      // if divided by 4 and no reminder
      if (year % 4 == 0) {
        // if divided by 100 and no reminder
        if (year % 100 == 0) {
          // if divided by 400 and no reminder
          if (year % 400 == 0) {
            return true;
          }
        } else {
          return true;
        }
      }
    }
    return false;
  }
}
