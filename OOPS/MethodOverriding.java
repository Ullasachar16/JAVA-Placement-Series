package OOPS;

public class MethodOverriding {
    //Program to implement method overriding using inheritance
}
class Father1{
    void bike(){
        System.out.println("fathers old fashioned bike");
    }
}
class Son1 extends Father1{
    @Override
    void bike(){
        System.out.println("new modified bike");
    }
    public static void main(String[] args) {
        Son1 s=new Son1();
        s.bike();
    }
}
