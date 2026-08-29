package Day7;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = new int[3];



       for (int i = 0; i<num.length; i++) {
           System.out.println(Arrays.toString(num));

           System.out.println("Enter the number");
           num[i] = sc.nextInt();
       }

       for (int i = 1; i<num.length; i++) {
           System.out.println("Enter the number 2");
           num[i] = sc.nextInt();







       }

        System.out.println(Arrays.toString(num));



















    }
}
