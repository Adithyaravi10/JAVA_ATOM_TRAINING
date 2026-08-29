class Laptop {
    String brand;

    public void start() {
        System.out.println("Laptop Started");
    }
}

class L1 {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.brand = "Lenovo";

        System.out.println("Brand: " + L1.brand);
        L1.start();
    }
}
