package Section_1_Java_basics.Data_types;

public class ByteShortIntLong {
  public static void main(String[] args) {
    int minInteger = Integer.MIN_VALUE;
    int maxInteger = Integer.MAX_VALUE;
    System.out.println("Min integer : " + minInteger);
    System.out.println("Max integer : " + maxInteger);

    byte minByte = Byte.MIN_VALUE;
    byte maxByte = Byte.MAX_VALUE;
    System.out.println("Min Byte : " + minByte);
    System.out.println("Max Byte : " + maxByte);

    short minShort = Short.MIN_VALUE;
    short maxShort = Short.MAX_VALUE;
    System.out.println("Min Short : " + minShort);
    System.out.println("Max Short : " + maxShort);

    Long minLong = Long.MIN_VALUE;
    Long maxLong = Long.MAX_VALUE;
    System.out.println("Min Long : " + minLong);
    System.out.println("Max Long : " + maxLong);

    byte newbyte = (byte) (maxByte / 2);
    System.out.println(newbyte);
  }
}
