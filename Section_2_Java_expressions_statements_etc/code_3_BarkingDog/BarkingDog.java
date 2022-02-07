package Section_2_Java_expressions_statements_etc.code_3_BarkingDog;

public class BarkingDog {
  public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
    if (hourOfDay < 0 || hourOfDay > 23) {
      return false;
    }
    if (isBarking && hourOfDay < 8 || isBarking && hourOfDay > 22) {
      return true;
    } else {
      return false;
    }
  }
}
