package Day9.Collections;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(4);
        li.add(5);
        li.add(6);

        li.remove(1);

        System.out.println(li);
    }
}
