package OOPS;

public class HasARelationshipExample {
    //program to show and implement has a relationship
    public static void main(String[] args) {
        Person3 p=new Person3();
        System.out.println("Name:"+p.name);
        System.out.println("Brand:"+p.m.brand);
        System.out.println("-------------");
        System.out.println("Id:"+Person3.id);
        System.out.println("Brand:"+Person3.b.brand);
    }
}
class Person3{
    String name="Tom";
    Mobile m=new Mobile();
    static int id=101;
    static Bike2 b=new Bike2();
}
class Mobile{
    String brand="Apple";
}
class Bike2{
    String brand="Honda";
}