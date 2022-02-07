package Section_4_OOP_Part_1.coding_30_Person;

public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }
  public String getLastName()  {
    return lastName;
  }
  public int getAge() {
    return age;
  }
  public void setFirstName(String name) {
    this.firstName = name;
  }
  public void setLastName(String name) {
    this.lastName = name;
  }
  public void setAge(int age) {
    if (age < 0 || age > 100) {
      this.age = 0;
    } else {
      this.age = age;
    }
  }
  public boolean isTeen() {
    if (this.age > 12 && this.age < 20) {
      return true;
    }
    return false;
  }
  public String getFullName() {
    if (this.firstName.isEmpty()) {
      return lastName;
    } else if (this.lastName.isEmpty()) {
      return firstName;
    } else {
      return firstName + " " + lastName;
    }
  }
}
