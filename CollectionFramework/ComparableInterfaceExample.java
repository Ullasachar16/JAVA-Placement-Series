package CollectionFramework;

import java.util.TreeSet;

class Car implements Comparable<Car> {
    //Example Program for comparable interface
    int cost;
    Car(int cost){
        this.cost=cost;
    }
    @Override
    public String toString(){
        return "cost:"+cost;
    }
    @Override
    public int compareTo(Car c){
        return this.cost-c.cost; //ascending order
        // return c.cost-this.cost //descending order
    }
}

public class ComparableInterfaceExample {
    public static void main(String[] args) {
        Car c1=new Car(200);
        Car c2=new Car(300);
        Car c3=new Car(100);
        TreeSet<Car> t=new TreeSet<Car>();
        t.add(c1);
        t.add(c2);
        t.add(c3);
        for(Car c:t){
            System.out.println(c);
        }
    }
}
