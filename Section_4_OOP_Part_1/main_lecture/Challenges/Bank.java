package Section_4_OOP_Part_1.main_lecture.Challenges;

public class Bank {
  private String accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public Bank(){
    this("123-45678-901", 10000.00, "bobby", "bobby@email.com", "+65 0912 4567");
    System.out.println("New account created!");
  }
  public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this. phoneNumber = phoneNumber;
  }

  // setter methods
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // getter methods
  public String getAccountNumber() {
    return accountNumber;
  }
  public String getCustomerName() {
    return customerName;
  }
  public String getEmail() {
    return email;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public double getBalance() {
    return balance;
  }

  // other methods
  public void addBalance(double fund) {
    this.balance += fund;
    System.out.println("Your new balanace : " + this.balance);
  }
  public void reduceBalance(double fund) {
    if (fund > this.balance) {
      System.out.println("Insufficient funds");
    } else {
      this.balance -= fund;
      System.out.println("Remaining balance : " + this.balance);
    }
  }
}
