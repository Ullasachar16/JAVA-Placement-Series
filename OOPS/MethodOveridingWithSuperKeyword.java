package OOPS;

public class MethodOveridingWithSuperKeyword {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.work();
        Tester t=new Tester();
        t.work();
    }
}
class Employee1{
    void work(){
        System.out.println("Employee working");
    }
}
class Developer extends Employee1{
    @Override
    void work(){
        super.work();
        System.out.println("developing app");
    }
}
class Tester extends Employee1{
    @Override
    void work(){
        System.out.println("testing app");
        super.work();
    }
}
