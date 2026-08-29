import java.util.Scanner;
class Login {
public static void main(String [] args) {
int rPin = 0000;
int uPin = 1010;
Scanner scn = new Scanner(System.in);
int uPin;
do { 
System.out.print("Enter the correct pin:");
uPin = scn.nextInt();
}
while(rPin != uPin);
System.out.print("Welcome");

}
}
}