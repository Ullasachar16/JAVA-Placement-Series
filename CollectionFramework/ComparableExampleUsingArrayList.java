package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Mobile1 implements Comparable<Mobile1>{
    //Program to show comparable interface working
    int cost;
    Mobile1(int cost){
        this.cost=cost;
    }
    @Override
    public String toString(){
        return "Cost:"+cost;
    }
    @Override
    public int compareTo(Mobile1 m){
        return this.cost-m.cost;
    }
}
public class ComparableExampleUsingArrayList {
    public static void main(String[] args) {
        Mobile1 m1=new Mobile1(20000);
        ArrayList<Mobile1> l=new ArrayList<>();
        l.add(m1);
        l.add(new Mobile1(10000));
        l.add(new Mobile1(15000));
        l.add(new Mobile1(25000));
        l.add(new Mobile1(8000));
        Collections.sort(l);
        for(Mobile1 m:l){
            System.out.println(m);
        }
    }
}
