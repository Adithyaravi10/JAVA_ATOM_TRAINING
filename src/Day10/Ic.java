package Day10;

public class Ic {
    public static void main(String[] args) {

        String name = "HELLO";
        String name1 = "HELLO";
        String  name2 = new String("HELLO");

        Integer a;
        Integer b = 128;

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name1 == name2);
        System.out.println(name2.equals(name1));

        a = 128;
        System.out.println(a==b);
    }
}
