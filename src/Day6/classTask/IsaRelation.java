package Day6.classTask;

public class IsaRelation {
    public static void main (String [] args) {
//        Phone p1 = new Phone() ;
//        Sim s1 = new Sim() ;
//        JioSim j1 = new JioSim() ;
        Sim s1 = new JioSim() ;
//        p1.call(s1) ;


    }

}

class Phone {
    public void call(Sim s) {
        s.connect() ;
        System.out.println("Calling....") ;


    }


}
class JioSim extends Sim {
    public void dataConnect() {
        System.out.println("Internet connected") ;

    }
    public void videoCall(JioSim s) {
        s.dataConnect() ;
        System.out.println("Video call started") ;

    }
}
class Sim {
    public void connect() {
        System.out.println("Connecting") ;
    }
}