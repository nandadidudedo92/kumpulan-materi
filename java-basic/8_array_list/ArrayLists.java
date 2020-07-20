import java.util.ArrayList;

public class ArrayLists {

  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add(1, "Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }

}