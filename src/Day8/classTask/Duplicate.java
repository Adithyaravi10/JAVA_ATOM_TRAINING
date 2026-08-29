package Day8.classTask;

import java.util.Arrays;

import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {

        int [] nums = new int[10000];

        for (int i = 0; i<nums.length; i++) {
            nums[i] = i+1;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println((int)(Math.random()*100));

//
//
       findDup(nums);

    }

    public static void findDup(int[]arr) {

        //compare one element to remaining
        //if they are equal print that dup. element

        int check = 0;
        int found = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length ; j++) {


                if (arr[i] == arr[j]) {
                    System.out.println("duplicate found "+  ++found+  " times");

                    System.out.println(arr[i]);
                }

            }


        }
        System.out.println("Checking pairs " +  ++check +  " times");



    }
}
