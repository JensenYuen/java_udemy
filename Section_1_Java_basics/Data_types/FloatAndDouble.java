package Section_1_Java_basics.Data_types;

public class FloatAndDouble {
  public static void main(String[] args) {
    float minfloat = Float.MIN_VALUE;
    float maxfloat = Float.MAX_VALUE;
    System.out.println("Min Float : " + minfloat);
    System.out.println("Max Float : " + maxfloat);

    Double minDouble = Double.MIN_VALUE;
    Double maxDouble = Double.MAX_VALUE;
    System.out.println("Min Double : " + minDouble);
    System.out.println("Max Double : " + maxDouble);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5d / 3d;
    System.out.println("Int after dividing by 3 : " + myIntValue);
    System.out.println("Float after dividing by 3 : " + myFloatValue);
    System.out.println("Double after dividing by 3 : " + myDoubleValue);
  }
}
