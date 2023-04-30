package CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
    //Tree Set example program using collections
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(40);
        t.add(35);
        t.add(50);
        t.add(20);
        t.add(10);
        System.out.println(t);

        TreeSet<String>ts=new TreeSet<>();
        ts.add("Banana");
        ts.add("Cat");
        ts.add("Apple");
        for(Object s:ts){
            System.out.println(s);
        }
        String x="A";
        String y="B";
        String z="C";
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));
        System.out.println(x.compareTo(x));
    }

}
