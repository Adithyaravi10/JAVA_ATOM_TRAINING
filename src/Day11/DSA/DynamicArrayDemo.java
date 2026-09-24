package Day11.DSA;

import java.util.*;
public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();

        d1.add(4);
        d1.add(9);
        d1.add(10);
        d1.add(11);



        d1.remove(1);

        d1.get(17);


//        System.out.println(d1.size()) ;
//        System.out.println(Arrays.toString(d1.arr));
//        System.out.println(d1.capacity);
        System.out.println(d1);
        System.out.println(d1.get(0));
        System.out.println(d1.get(1));

    }
}
class DynamicArray {

    int init_capacity ;
    int capacity;
    int arr [] ;
    int size;
    int pos;

    DynamicArray() {
        init_capacity = 5;
        capacity = init_capacity;
        arr = new int[capacity];
        size = 0;
        pos = 0;

    }
    public void add(int val){

        if(size>=capacity/2) {
            capacity = 2 * capacity;
            int[] newarr = new int[capacity];

            for (int i = 0; i < size; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
       arr[pos] = val;
       pos = pos+1;
       size++;
    }

    public int size() {
        return size;
    }

    public String toString() {
        int [] temp = new int [size];
        for (int i = 0; i < size; i++) {
            temp[i]= arr[i];
        }
        return Arrays.toString(temp);
    }
    public void remove(int index) {
        for (int i = index; i<size; i++) {
            arr[i] = arr[i+1];
        }
        pos--;
        size--;
    }
    public int get(int index) {
        if (index > size-1 || index<0) {
            System.out.println("INVALID INDEX");
            return -1;
        }
     return arr[index];
    }





}
