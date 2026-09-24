package Day4;

public class Laptop {
    String brand;
    String model;
    int ram;
    int storage;

    public void start() {
        System.out.println("Laptop Started");
    }

    public void installApp(String appName, int memory) {
        storage = storage - memory;
        System.out.println(appName + " installed successfully. Remaining storage: " + storage);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "Lenovo";
        l1.model = "Ideapad";
        l1.ram = 16;
        l1.storage = 512;

        l1.start();
        l1.installApp("GTA", 100);
        l1.installApp("Hitman", 120);

        System.out.println("Brand: " + l1.brand);
        System.out.println("Model: " + l1.model);
        System.out.println("RAM: " + l1.ram);
        System.out.println("Storage: " + l1.storage);

        System.out.println();

        Laptop l2 = new Laptop();
        l2.brand = "Dell";
        l2.model = "G";
        l2.ram = 8;
        l2.storage = 512;

        l2.start();
        System.out.println("Brand: " + l2.brand);
        System.out.println("Model: " + l2.model);
        System.out.println("RAM: " + l2.ram);
        System.out.println("Storage: " + l2.storage);
    }
}
