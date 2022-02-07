package Section_2_Java_expressions_statements_etc.code_7_TeenNumberChecker;

public class TeenNumberChecker {
  public static boolean hasTeen(int personOne, int personTwo, int personThree) {
    boolean personOneIsTeen = isTeen(personOne);
    boolean personTwoIsTeen = isTeen(personTwo);
    boolean personThreeIsTeen = isTeen(personThree);
    if (personOneIsTeen || personTwoIsTeen || personThreeIsTeen) {
      return true;
    }
    return false;
  }
  public static boolean isTeen(int personAge) {
    if (personAge >= 13 && personAge <=19) {
      return true;
    }
    return false;
  }
}
