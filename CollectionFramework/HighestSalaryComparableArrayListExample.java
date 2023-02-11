package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Employ implements Comparable<Employ>{
    //Program to sort employee details with highest and lowest salary using comparable interface
    String name;
    int salary;
    public Employ(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Name:"+name+"\nSalary:"+salary;
    }
    @Override
    public int compareTo(Employ e){
        return this.name.compareTo(e.name);
    }
}
public class HighestSalaryComparableArrayListExample {
    public static void main(String[] args) {
        Employ e1=new Employ("King",25000);
        ArrayList<Employ> l=new ArrayList<>();
        l.add(e1);
        l.add(new Employ("Scott",24000));
        l.add(new Employ("Allen",12000));
        l.add(new Employ("Ward",30000));
        Collections.sort(l);
        System.out.println("Highest salary->"+l.get(l.size()-1));
        System.out.println("Lowest salary->"+l.get(0));
    }
}
