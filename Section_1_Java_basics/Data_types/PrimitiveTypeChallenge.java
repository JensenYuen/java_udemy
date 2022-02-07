package Section_1_Java_basics.Data_types;

public class PrimitiveTypeChallenge {
  public static void main(String[] args) {
    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 50;

    long longtotal = 50000L + 10L * (byteValue + shortValue + intValue);
    System.out.println(longtotal);
  }
}
