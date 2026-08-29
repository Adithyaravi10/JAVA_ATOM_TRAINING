package Day7;

import java.sql.SQLOutput;

public class StringsDemo {
    public static void main (String [] args ) {
        //String name = "ROCKS D XEBEC";

        String name = "ROCKS D XEBEC";

        name = "RORONOA ZORO";
        int count = 0;

        for (int i = name.length()-1;i>=0;i--) {
            if (name.charAt(i) == 'R') {
                count++;
            }
        }
        System.out.println("Number of R's:" +count);





    }
}
