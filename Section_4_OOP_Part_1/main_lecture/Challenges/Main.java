package Section_4_OOP_Part_1.main_lecture.Challenges;

public class Main {
  public static void main(String[] args) {
    Bank bobsAccount = new Bank();
    bobsAccount.setBalance(10000);
    bobsAccount.setAccountNumber("102-123411-123");
    bobsAccount.setCustomerName("bob");
    bobsAccount.setEmail("email@meial.com");
    bobsAccount.setPhoneNumber("+65 0987 1233");
    System.out.println(bobsAccount.getAccountNumber());
    System.out.println(bobsAccount.getBalance());
    System.out.println(bobsAccount.getCustomerName());
    System.out.println(bobsAccount.getEmail());
    System.out.println(bobsAccount.getPhoneNumber());

    Bank defaultAcc = new Bank();
    System.out.println(defaultAcc.getCustomerName());
    System.out.println(defaultAcc.getAccountNumber());
  }
}
