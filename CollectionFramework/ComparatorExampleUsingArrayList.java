package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Beer{
    String brand;
    int cost;
    public Beer(String brand, int cost) {
        this.brand = brand;
        this.cost = cost;
    }
    @Override
    public String toString(){
        return "Brand:"+brand+"\nCost:"+cost;
    }
}
class SortBeerByBrand implements Comparator<Beer>{
    @Override
    public int compare(Beer x,Beer y){
        return y.brand.compareTo(x.brand);
    }
}
class SortBeerByCost implements Comparator<Beer>{
    @Override
    public int compare(Beer x,Beer y){
        return x.cost-y.cost;
    }
}
public class ComparatorExampleUsingArrayList {
    //Program to Show the Example of comparator interface
    public static void main(String[] args) {
        Beer b1=new Beer("Tuborg",190);
        ArrayList<Beer> l=new ArrayList<>();
        l.add(b1);
        l.add(new Beer("Budweiser",220));
        l.add(new Beer("KF",160));
        l.add(new Beer("Black Dog",200));
        Collections.sort(l,new SortBeerByCost());
        for(Beer b:l){
            System.out.println(b);
        }
    }
}
