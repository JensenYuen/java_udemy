package Section_2_Java_expressions_statements_etc.code_2_MegaByteConvertor;

public class MegaByteConvertor {
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    // prints a message in the following format
    // XX KB = YY MB and ZZ KB
    // eg: 2500 KB = 2 MB 452 KB
    // 1 MB = 1024KB
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int megaByte = (kiloBytes / 1024);
      int reminderKiloByte = (kiloBytes % 1024);
      System.out.println(
        kiloBytes + " KB = " +
        megaByte + " MB and " +
        reminderKiloByte + " KB"
      );
    }
  }
}
