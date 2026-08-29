package Day9;

public class RecursionDemo {
    public static void main(String[] args) {

        System.out.println("MAIN METHOD");
        int count = 5;
        System.out.println(fibo(60));


    }
    public static int fibo(int n) {

        if (n == 0) {
            return 0;

        } else if (n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);


    }
}
