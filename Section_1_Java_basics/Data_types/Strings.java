package Section_1_Java_basics.Data_types;

public class Strings {
  public static void main(String[] args) {
    String myString = "This is a test string";
    char copyright = '\u00A9';
    String currentYear = copyright + " 2022";

    System.out.println("myString = " + myString + ", " + currentYear);
  }
}
