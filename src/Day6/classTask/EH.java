package Day6.classTask;

public class EH {
    public static void main (String [] args) {
        System.out.println("Null Point Exception") ;
        String a = null ;

        try {
            System.out.println(a.length());
        }
        catch (Exception e){
            System.out.println(e) ;
//            System.out.println("exception handled") ;
        }
        finally {

            System.out.println("Program ends");
        }

    }
}
