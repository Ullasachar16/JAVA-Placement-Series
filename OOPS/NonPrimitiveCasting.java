package OOPS;

public class NonPrimitiveCasting {
    public static void main(String[] args) {
        Vehicle2 v=new Car2();
        System.out.println(v.brand);
        v.start();
        Car2 c=(Car2) v;
        System.out.println(c.brand+" "+c.cost);
        v.start();
        ((Car2) v).stop();
    }
}
//Upcasting and Downcasting
class Vehicle2{
    String brand="Suzuki";
    void start(){
        System.out.println("Vehicle Started");
    }
}
class Car2 extends Vehicle2{
    int cost=50000;
    void stop(){
        System.out.println("Vehicle Stopped");
    }
}