package Day12;

import java.util.*;
public class StackDemo {
    public static void main(String[] args) {

       StackByArray s = new StackByArray();
       s.push(3);
       s.push(13);
       s.push(34);

      System.out.println(s.poll());
      System.out.println(s.poll());
      System.out.println(s.poll());

        System.out.println(s.poll());

//       s.display();

        System.out.println(s);

    }
}

class StackByArray {
    int[] arr;
    int size;
    int capacity = 5;
    int tos = -1;

    StackByArray() {
        this.arr = new int[capacity];
        this.size = 0;

    }

    public void push(int val) throws IllegalArgumentException {
        if (size == capacity) {
            throw new IllegalStateException("STACK IS FULL");

        }
        tos = tos + 1;
        arr[tos] = val;
        size = size + 1;

    }

    public void pop() {
        if (tos == -1) {
            System.out.println("STACK IS EMPTY");
            return;
        }
        tos--;
        size = size - 1;

    }

    public boolean isEmpty() {
        return tos == -1;
    }

    public int poll() {
        int data = arr[tos];
        if (!isEmpty()) {
            tos--;
            size--;
        } else {
            throw new IllegalStateException("STACK IS EMPTY ");
        }
        return data;
    }


    public void display() {
        for (int  i = 0; i<size; i++) {
            System.out.print(arr[i] + "-> ");
        }
    }

}