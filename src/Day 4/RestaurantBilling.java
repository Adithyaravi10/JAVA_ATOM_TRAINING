import java.util.Scanner;

class FoodItem {
String name;
double price;
int qty;

FoodItem(String n, double p, int q) {
name = n;
price = p;
qty = q;
}

void bill() {
double total = price * qty;
double discount = 0;

if (total > 50)
discount = total * 0.10;

System.out.println("\n**** BILL ****");
System.out.println("Item: " + name);
System.out.println("Quantity: " + qty);
System.out.println("Price: $" + price);
System.out.println("Total: $" + total);
System.out.println("Discount: $" + discount);
System.out.println("Final Bill: $" + (total - discount));
}
}

public class RestaurantBilling {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("1. Pizza - $12");
System.out.println("2. Burger - $8");
System.out.println("3. Pasta - $10");
System.out.print("Enter choice: ");
int choice = sc.nextInt();

System.out.print("Enter quantity: ");
int qty = sc.nextInt();

FoodItem item;

switch (choice) {
case 1:
item = new FoodItem("Pizza", 12, qty);
break;

case 2:
item = new FoodItem("Burger", 8, qty);
break;

case 3:
item = new FoodItem("Pasta", 10, qty);
break;

default:
System.out.println("Invalid choice");
return;
}
        item.bill();

        sc.close();
    }
}