import java.util.Scanner;
class Userinput{
public static void main(String[] args){
Scanner scn = new Scanner(System.in);
String name = scn.nextLine();
int age = scn.nextInt();
System.out.print("my name is "+name +" and age is " + age");
}}