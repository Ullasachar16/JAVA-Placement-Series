package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    //Program to implement collections class in collection framework example 1
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add(40);
        l.add(15);
        l.add(35);
        l.add(21);
        System.out.println("before sorting");
        for(Object i:l){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("after sorting");
        Collections.sort(l);
        for(Object i:l){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("reverse");
        Collections.reverse(l);
        for (Object obj:l){
            System.out.print(obj+" ");
        }

    }
}
