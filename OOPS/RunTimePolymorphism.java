package OOPS;

public class RunTimePolymorphism {
    //program to implement runtime polymorphism
    Employe1 e=new Developer3();
    static void display(Employe1 e){ //superclass reference
        e.work();
    }
    public static void main(String[] args) {
        display(new Developer3()); //passing subclass objects
        display(new Tester2());
        System.out.println("_________________");
        Employe1 e1=new Developer3();
        e1.work();
        System.out.println("-----------------");
        Employe1 e2=new Tester2();
        e2.work();
        System.out.println("..................");
        Employe1 e; //superclass reference
        e=new Developer3(); //passing subclass objects
        e.work();
        System.out.println(",,,,,,,,,,,,,,,,,");
        e=new Tester2();
        e.work();
    }
}
class Employe1{
    void work(){
        System.out.println("Working");
    }
}
class Developer3 extends Employe1{
    @Override
    void work(){
        System.out.println("developing app");
    }
}
class Tester2 extends Employe1{
    @Override
    void work(){
        System.out.println("testing app");
    }
}