package OOPS;

public class ConstructorChainingContinued {
    //another one constructor chaining
    public static void main(String[] args) {
        Student1 s=new Student1(10,"Jack",95);
        System.out.println("Student Details");
        System.out.println("Name:"+s.name+"\nId:"+s.id+"\nMarks:"+s.marks);
        System.out.println("*********************************");
        Employee3 e=new Employee3(101,"Tom",45.5);
        System.out.println("Employee Details");
        System.out.println("Name:"+e.name+"\nId:"+e.id+"\nSalary:"+e.salary);
    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Student1 extends Person{
    int marks;
    Student1(int id,String name,int marks){
        super(id, name);
        this.marks=marks;
    }
}
class Employee3 extends Person{
    double salary;
    Employee3(int id,String name,double salary){
        super(id, name);
        this.salary=salary;
    }
}