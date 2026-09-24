package Day10;

import java.util.ArrayList;
public class ArrayListsDemo1 {
    public static void main(String[] args) {
//        int [] arr = new int [4];

        ArrayList<Integer> li = new ArrayList<Integer>();
        ArrayList<Car> cars = new ArrayList<Car>();

        Car c1 = new Car();
        c1.brand = "Tesla";
        c1.model = "S1";

        Car c2 = new Car();
        c2.brand = "Tesla";
        c2.model = "S2";

        Car c3 = new Car();
        c3.brand = "Tesla";
        c3.model = "S3";

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car:" + " "+cars.get(i));
        }

    }
}
class Car {
    String brand;
    String model;

    public String toString() {
        return this.brand + " " +this.model;
    }





    }



