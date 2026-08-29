package Day8.classTask;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = 0;

        System.out.println( "Before swap: " + a + " " +b);

       a = a + b;
       b = a - b;
       a = a - b;

        System.out.println( "After swap: " + a + " " +b);
    }
}
