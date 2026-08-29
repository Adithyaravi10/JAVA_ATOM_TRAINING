import java.util.Scanner;
class UserInfo{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.println("Enter your name:");
String name = scn.nextLine();
System.out.println("Enter your age:");
int age = scn.nextInt();
System.out.println("Enter your gpa:");
float gpa = scn.nextFloat();
System.out.println("Enter your aadhar number:");
long aadhar = scn.nextLong();
System.out.println("Enter your dob:");
String dob = scn.next();
System.out.print("my name is "+ name +" and my age is "+ age +" and my gpa is "+ gpa +" and my aadhar number is "+ aadhar +" and my dob is "+ dob +"");
}}