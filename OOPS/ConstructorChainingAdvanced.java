package OOPS;

public class ConstructorChainingAdvanced {
    //Program to show the usage of constructor chaining example
    public static void main(String[] args) {
        B b=new B(5.7);
    }
}
class A{
    A(int x){
        this("tom");
        System.out.println(1);
    }
    A(String x){
        System.out.println(2);
    }
}
class B extends A{
    B(){
        super(10);
        System.out.println(3);
    }
    B(double x){
        this();
        System.out.println(4);
    }
}

