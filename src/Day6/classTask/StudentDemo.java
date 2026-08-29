package Day6.classTask;

public class StudentDemo {
    public static void main (String [] args) {
        Student s1 = new Student(1,"Harithi","CSE", "SNPSU");
        Student s2 = new Student(2,"Hari","AIDS","SNPSU");
        Student s3 = new Student(3, "Anu","ECE","SNPSU");
        s1.writeTest();
        s2.writeTest() ;
        s3.writeTest() ;
        s1.getcollegeInfo();





    }
}
class Student {
    int id;
    String name;
    String dept;
    static String clg = "SNPSU";

    Student (int id, String name, String dept,String clg) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.clg = clg;

//   public static void studentInfo(){
//        System.out.print("Student name is" +name);
//        System.out.print("Student dept is" +dept);
//        System.out.print("Student clg is" +clg);
//
//        }

    }
    public static void getcollegeInfo() {
        System.out.println("College:" +clg);
    }
    public void writeTest() {
        System.out.println(name + " is writing exam");
    }

}