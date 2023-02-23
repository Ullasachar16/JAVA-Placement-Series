package OOPS;

public class ConstructorChaining {
 //Program to show constructor chaining example
}
class Student{
    Student(int age){
        this(5.7);
        System.out.println("age:"+age);
    }
    Student(String name){
        this(20);
        System.out.println("name:"+name);
    }
    Student(double height){
        System.out.println("height:"+height);
    }

    public static void main(String[] args) {
        Student s=new Student("tom");
    }
}
