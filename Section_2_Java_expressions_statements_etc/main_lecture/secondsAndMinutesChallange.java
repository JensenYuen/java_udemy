package Section_2_Java_expressions_statements_etc.main_lecture;

// This challange is to practice method overloading
public class secondsAndMinutesChallange {
  private static final String INVALID_VALUE_MESSAGE = "Invalid value";
  public static void main(String[] args) {
    System.out.println(getDurationString(600, 59));
    System.out.println(getDurationString(3600));
  }
  private static String getDurationString(int minutes, int seconds) {
    if (minutes >= 0 || (seconds >= 0 && seconds <= 59)) {
      int hours = minutes / 60;
      minutes = minutes % 60;

      return(hours + "h " + minutes + "m " + seconds + "s");
    } else {
      return INVALID_VALUE_MESSAGE;
    }
  }
  private static String getDurationString(int seconds) {
    if (seconds >=0) {
      int minutes = seconds / 60;
      seconds = seconds % 60;
      return getDurationString(minutes, seconds);
    } else {
      return INVALID_VALUE_MESSAGE;
    }
  }
}
