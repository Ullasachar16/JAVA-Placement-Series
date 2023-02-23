package OOPS;

public class ConstructorChainingAdvanced1 {
    //Another example program of constructor chaining
    public static void main(String[] args) {
        Bike1 b=new Bike1("Bajaj",375000,"green");
        b.display();
        System.out.println("+++++++++++++++++++++++");
        Car1 c=new Car1("Suzuki",700000,"Petrol");
        c.display();
    }
}
class Vehicle1{
    String brand;
    int cost;
    Vehicle1(String brand,int cost){
        this.brand=brand;
        this.cost=cost;
    }
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Cost:"+cost);
    }
}
class Car1 extends Vehicle1{
    String fuel;
    Car1(String brand,int cost,String fuel){
        super(brand, cost);
        this.fuel=fuel;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Fuel:"+fuel);
    }
}
class Bike1 extends Vehicle1{
    String color;
    Bike1(String brand,int cost,String color){
        super(brand, cost);
        this.color=color;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Color:"+color);
    }
}