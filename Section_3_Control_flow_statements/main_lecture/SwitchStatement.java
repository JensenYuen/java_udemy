package Section_3_Control_flow_statements.main_lecture;

public class SwitchStatement {
  public static void main(String[] args) {
    int value = 3;
    switch (value) {
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3:case 4:case 5:
        System.out.println("Value was 3 or 4 or 5");
        System.out.println("Actual value was " + value);
        break;
      default:
        System.out.println("Invalid number");
        break;
    }
    // Start of challange
    char letter = 'Z';
    switch (letter) {
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
        System.out.println("letter found!");
        break;

      default:
        System.out.println("letter not found");
        break;
    }
  }
}
