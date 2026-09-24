import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        int rPin = 1010; // correct pin
        int uPin;        // user input pin

        Scanner scn = new Scanner(System.in);

        // keep asking until user enters the correct pin
        do {
            System.out.print("Enter the correct pin: ");
            uPin = scn.nextInt();
        } while (rPin != uPin);

        System.out.println("Welcome");
    }
}
