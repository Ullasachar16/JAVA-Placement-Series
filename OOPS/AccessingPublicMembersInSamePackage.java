package OOPS;

public class AccessingPublicMembersInSamePackage {
    //accessing public members in diff class
    public static void main(String[] args) {
        Student2 s1=new Student2();
        System.out.println(s1.age);
        s1.study();
    }
}
class Student2{
    //accessing public members with same class
    public int age=25;
    public Student2(){
        System.out.println("In Student");
    }
    public void study(){
        System.out.println("Studying");
    }

//    public static void main(String[] args) {
//        Student2 s=new Student2();
//        System.out.println("Age:"+s.age);
//        s.study();
//    }
}
