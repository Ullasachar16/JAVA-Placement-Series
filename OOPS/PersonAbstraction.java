package OOPS;
public abstract class PersonAbstraction{
    //Program to implement abstraction example
    abstract void work();
}
class Employe2 extends PersonAbstraction{
    @Override
    public void work(){
        System.out.println("Working");
    }
}
class Test{
    public static void main(String[] args) {
        Employe2 e=new Employe2();
        e.work();       //normal invoke of overridden method
        PersonAbstraction p=new Employe2(); //Upcasting
        p.work();       //Abstraction
    }
}
