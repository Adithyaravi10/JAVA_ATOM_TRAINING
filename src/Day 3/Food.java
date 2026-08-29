import java.util.Scanner;
class Food {
public static void main (String [] args) {
Scanner scn = new Scanner(System.in);
System.out.print("WELCOME!\n");
System.out.print("PLEASE ENTER YOUR ORDER; HERE ARE THE DISHE CATEGORIES:\n1.VEG \n2.NON-VEG \n3.STARTERS \n4.BEVERAGES \n5.SALADS \n6.DESSERTS \n");

System.out.print("Enter the dish code:");
int dish = scn.nextInt();

switch(dish){

case 1 :
System.out.print("Veg:\n1.Paneer masala \n2.Butter naan \n3.Vegetable Curry");

break;

case 2 :
System.out.print("Non-Veg:\n1.Chicken Biriyani \n2.Chicken Kebab \n3.Fish Fry");
break;

case 3 :
System.out.print("Starters:\n1.Gobi Manchurian \n2.Mushroom Munchurian \n3.Aloo tikka");
break;

case 4 :
System.out.print("Beverages:\n1.Coffee \n2.Tea \n3.Hot Chocolate");
break;

case 5 :
System.out.print("Salads:\n1.Vegetable salad \n2.Sprouts salad \n3.Special Cucumber-sprouts salad");
break;

case 6 :
System.out.print("Desserts:\n1.Ice-Cream \n2.Choco Cake \n3.Rasgulla");
break;

default:
System.out.print("Invalid code");
}
}
}
