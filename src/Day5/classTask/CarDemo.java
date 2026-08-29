package Day5.classTask;

public class CarDemo {
    public static void main(String [] args) {
//       ElectricCar e1 = new ElectricCar();
//         e1.start();
//        Tesla t1 = new Tesla();


Car c1 = new Car();
c1.speed = 30;
c1.brake(0);
c1.brake();

    }


}
class Car {
    String brand;
    String model;
    int speed;
    int MaxSpeed;

    //methods

    public void start() {
        System.out.print("Car Started");
    }
    public void brake() {
        speed = speed - 5;
        System.out.print(" Brake applied"+ " car speed is "+speed);
    }
    public void brake(int speed) {
        this.speed = 0;
        System.out.print("Hand brake applied");

    }

    }
class ElectricCar extends Car {
    ElectricCar(String brand,String model) {
        this.brand = brand;
        this.model = model;


        System.out.print("Electric car is created") ;
    }
    public void start() {
        System.out.print("Electric car is started");

    }
class Tesla extends ElectricCar {
        Tesla() {
            super("Tesla","s1") ;

        }


}

}