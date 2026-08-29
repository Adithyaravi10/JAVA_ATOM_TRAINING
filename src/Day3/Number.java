import java.util.Scanner;
class Number {
public static void main (String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Enter a number:");
int num = scn.nextInt();

if(num>500) {
System.out.print("The number is greater than 500"); 

} else if(num>100) {
System.out.print("The number is greater than 100");

} else if(num>50) {
System.out.print("The number is greater than 50");}

else{
System.out.print("The number is less than 50");
}
}}  