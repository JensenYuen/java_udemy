package Section_3_Control_flow_statements.code_13_NumberOfDaysInMonth;

public class NumberOfDaysInMonth {
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
  public static int getDaysInMonth(int month, int year) {
    if ((month < 1 || month > 12 )||(year < 1 || year > 9999)) {
      return -1;
    }
    if (isLeapYear(year) && month == 2) {
      return 29;
    } else {
      switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          return 31;

        case 2:
          return 28;

        default:
          return 30;
      }
    }
  }
}
