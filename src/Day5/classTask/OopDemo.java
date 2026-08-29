package Day5.classTask;

public class OopDemo {
    public static void main(String [] args) {
        D d1 = new D();
        d1.run() ;

    }




}

class A {
    public void run() {
        System.out.print("A runs");
    }
}
class B extends A{}

interface C {
    void run();

}
class y{}

class D extends y implements C{
    public void run() {
        System.out.print("D is running") ;
    }


}