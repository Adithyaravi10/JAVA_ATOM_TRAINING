// Car1.java
public class Car1 {
    // variables
    String brand;
    String model;
    int speed;
    int maxSpeed = 50;

    // methods
    public void start() {
        System.out.println("Car started");
    }

    public void accelerate() {
        speed = speed + 5;
        System.out.println("Accelerated, car travelling at " + speed + " kms");
    }

    public void brake() {
        speed = speed - 5;
        System.out.println("Brake applied, car travelling at " + speed + " kms");
    }
}

// CarDemo.java
public class CarDemo {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.brand = "BMW";
        c1.start();
        c1.accelerate();
        c1.brake();
    }
}
