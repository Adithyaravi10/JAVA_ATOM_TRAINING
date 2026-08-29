public class Laptop {
    String brand;
    String model;
    int ram;
    int storage;
    


    public void start() {
        System.out.println("Laptop Started");
    }

        public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "Lenovo";
        l1.start();
        l1.installApp("gta", 100);
        l1.installApp("hitman", 120);
        System.out.println("Brand:" +l1.brand);

l1.model = "ideapad";
System.out.println("Model:" +l1.model);

l1.ram = 16;
System.out.println("RAM:" +l1.ram);

l1.storage = 512;
System.out.println("Storage:" +l1.storage);

System.out.print("\n");

Laptop l2 = new Laptop();
l2.brand = "DELL";
l2.start();
System.out.println("Brand:" +l2.brand);

l2.model = "G";
System.out.println("Model:" +l2.model);

l2.ram = 8;
System.out.println("RAM:" +l2.ram);

l2.storage = 512;
System.out.println("Storage:" +l2.storage);

public void installApp(String appName, int memory) {
storage = storage - memory;

System.out.print(appName + " installed successfully " + " remaining storage " + storage);


} 
}
}

