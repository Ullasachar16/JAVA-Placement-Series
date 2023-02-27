package OOPS;

abstract class SwiggyAbstractMethod {
    //Program to implement abstract method
    abstract void orderFood();
}
abstract class Phonepe extends SwiggyAbstractMethod{
    abstract void payAmount();
}
class Person1 extends Phonepe{
    @Override
    void orderFood(){
        System.out.println("ordered food");
    }
    @Override
    void payAmount(){
        System.out.println("Payment successful");
    }
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.orderFood();
        p.payAmount();
    }
}