package Day7;

public class SecondMax {
    public static void main (String [] args) {


    int [] arr = {2,3,4,5,7,6,6};

    int max = arr[0];
    int sMax = arr[0];

    for (int i = 0; i<arr.length; i++) {
        if (arr[i] > max) {
            sMax = max;
            max = arr[i];
        }

        else if (arr[i] > sMax ) {
            sMax = arr[i];

        }


        }
        System.out.println( " " + sMax);
    }
}
