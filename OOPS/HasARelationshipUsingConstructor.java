package OOPS;

public class HasARelationshipUsingConstructor {
    //Example program of HAS-A relationship using constructor
    public static void main(String[] args) {
        College1 clg=new College1("Jspiders",new Student3("Jack"));
        System.out.println("College name:"+clg.name);
        System.out.println("Student name:"+clg.student.name);
    }
}
class College1{
    String name;
    Student3 student;
    College1(String name,Student3 student){
        this.name=name;
        this.student=student;
    }
}
class Student3{
    String name;
    Student3(String name){
        this.name=name;
    }
}