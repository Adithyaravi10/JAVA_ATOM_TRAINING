import java.util.Scanner;
class UserData{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter your SRN:");
String SRN = scn.nextLine();
System.out.println("Enter your name:");
String name = scn.nextLine();
System.out.println("Enter your Department:");
String Department = scn.nextLine();
System.out.print("My name is "+ name +" and my SRN is "+ SRN +" and my Department is "+ Department +" ");
}}