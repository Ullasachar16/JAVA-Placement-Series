package OOPS;

public class HasARelationshipWithoutUsingConstructor {
    //example pgm of has a relationship without using constructors
    public static void main(String[] args) {
        College2 clg=new College2();
        System.out.println("College name:"+clg.name);
        System.out.println("Student name:"+clg.student.name);
        System.out.println("Student age:"+clg.student.age);
        System.out.println("Student id:"+clg.student.id);
        System.out.println("Laptop name:"+clg.student.l.brand);
        System.out.println("Laptop cost:"+clg.student.l.brand);
    }
}
class College2{
    String name="BIT";
    Student4 student=new Student4();
}
class Student4{
    int age=23;
    int id=101;
    String name="Praveen";
    Laptop l=new Laptop();
}
class Laptop{
    String brand="HP";
    int cost=60000;
}
