package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        //program to implement multilevel inheritance
        Department d=new Department();
        System.out.println(d.universityName);

        System.out.println(d.collegeName);

        System.out.println(d.depName);
        d.conductExams();
        d.conductInternals();
        d.provideAssignments();
    }
}
class University{
    String universityName="VTU";
    void conductExams(){
        System.out.println("vtu conducting exams");
    }
}
class College extends University{
    String collegeName="BIT";
    void conductInternals(){
        System.out.println("BIT conducting internals");
    }
}
class Department extends College{
    String depName="CSE";
    void provideAssignments(){
        System.out.println("cse giving assignments");
    }
}
