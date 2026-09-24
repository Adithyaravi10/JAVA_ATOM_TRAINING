package Day4;

public class Car1 {
    // inner Car1 class
    static class car1 {
        String brand;
        String model;
        int speed;
        int maxSpeed;

        // constructor
        public car1(String brand, String model, int maxSpeed) {
            this.brand = brand;
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.speed = 0; // start at rest
        }

        // methods
        public void start() {
            System.out.println(brand + " " + model + " started");
        }

        public void accelerate() {
            if (speed + 5 <= maxSpeed) {
                speed += 5;
                System.out.println("Accelerated, car travelling at " + speed + " kms");
            } else {
                System.out.println("Cannot accelerate beyond max speed of " + maxSpeed + " kms");
            }
        }

        public void brake() {
            if (speed - 5 >= 0) {
                speed -= 5;
                System.out.println("Brake applied, car travelling at " + speed + " kms");
            } else {
                System.out.println("Car has stopped");
                speed = 0;
            }
        }
    }

    // main method
    public static void main(String[] args) {
        car1 c1 = new car1("BMW", "X5", 50);
        c1.start();
        c1.accelerate();
        c1.accelerate();
        c1.brake();
        c1.brake();
        c1.brake(); // shows stop behavior

        System.out.println();

        car1 c2 = new car1("Audi", "A4", 60);
        c2.start();
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();
        c2.brake();
    }
}
