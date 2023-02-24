package OOPS;

public class HierarchicalInheritance {
    //Program to show hierarchical inheritance
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        System.out.println(c.brand+" "+c.color);
        c.start();
        System.out.println(b.brand+" "+b.cost);
        b.stop();
    }
}
class Vehicle{
    String brand="Honda";
}
class Car extends Vehicle{
    String color="Black";
    void start(){
        System.out.println("Car Started");
    }
}
class Bike extends Vehicle{
    int cost=500000;
    void stop(){
        System.out.println("Bike Stopped");
    }
}
