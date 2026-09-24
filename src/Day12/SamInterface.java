package Day12;

public class SamInterface {
    public static void main(String[] args) {

        flyable f = new flyable() {

            public void fly() {
                System.out.println("Bird is flying");
            }



    };
        runnable r = new runnable() {
            public void run() {
                System.out.println("Running");
            }
        };

        f.fly();
        r.run();

        }



    }




interface flyable {
    public void fly();
}

interface runnable {
    public void run();
}