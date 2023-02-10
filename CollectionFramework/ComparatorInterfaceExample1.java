package CollectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class Hotel{
    //Program to implement Comparator Interface
    String name;
    Double ratings;
    public Hotel(String name, Double ratings) {
        this.name = name;
        this.ratings = ratings;
    }
    @Override
    public String toString(){
        return "Ratings of "+name+" hotel is "+ratings;
    }
}
class SortHotelByName implements Comparator<Hotel>{
    @Override
    public int compare(Hotel x,Hotel y){
        return x.name.compareTo(y.name);
    }
}
class SortHotelByRatings implements Comparator<Hotel>{
    @Override
    public int compare(Hotel x,Hotel y){
        return y.ratings.compareTo(x.ratings);
    }
}
public class ComparatorInterfaceExample1 {
    public static void main(String[] args) {
        Hotel h1=new Hotel("Taj",4.8);
        TreeSet<Hotel>t=new TreeSet<>(new SortHotelByRatings());
        t.add(h1);
        t.add(new Hotel("Empire",3.8));
        t.add(new Hotel("Brahmins",4.1));
        t.add(new Hotel("ITC",4.7));
        for(Hotel h:t){
            System.out.println(h);
        }
    }

}
