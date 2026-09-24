import java.util.Scanner;

class Userinput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scn.nextLine();

        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        System.out.print("My name is " + name + " and age is " + age);
    }
}

