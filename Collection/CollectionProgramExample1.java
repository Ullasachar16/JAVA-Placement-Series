package Collection;

import java.util.LinkedList;
import java.util.Objects;

public class CollectionProgramExample1 {
    public static void main(String[] args) {
        Mobile m1=new Mobile("Samsung",25000);
        LinkedList<Mobile>l=new LinkedList<Mobile>();
        l.add(m1);
        l.add(new Mobile("Xiomi",18000));
        l.add(new Mobile("Realme",15000));
        l.add(new Mobile("Iphone",125000));
        for(Mobile m:l){
            if(m.cost>=10000&&m.cost<=25000){
                System.out.println(m);
            }
        }
    }
}
class Mobile{
    String brand;
    int cost;
    public Mobile(String brand, int cost) {
        this.brand = brand;
        this.cost = cost;
    }
    public String toString(){
        return "Cost of "+brand+" is "+cost;
    }
}
