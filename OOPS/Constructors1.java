package OOPS;

public class Constructors1 {
    String brand;
    int cost;
    int ramSize;

    public Constructors1(String brand, int cost, int ramSize) {
        this.brand = brand;
        this.cost = cost;
        this.ramSize = ramSize;
    }
    void display(){
        System.out.println(brand+" "+cost+" "+ramSize);
    }
}
class Sol{
    public static void main(String[] args) {
        Constructors1 c=new Constructors1("hp",40,8);
        Constructors1 c1=new Constructors1("dell",50,12);
        c.display();
        c1.display();
    }
}
