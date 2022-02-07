package Section_4_OOP_Part_1.main_lecture;

public class Car {
  // private int doors;
  // private int wheels;
  private String model;
  // private String engine;
  // private String colour;

  public void setModel(String model) {
    String validModel = model.toLowerCase();
    this.model = validModel;
  }
  public String getModel() {
    return model;
  }
}
