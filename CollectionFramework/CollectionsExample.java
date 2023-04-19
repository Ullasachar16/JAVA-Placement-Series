package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    //Program to Implement Collections Class in Collection Framework Example 1
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add(40);
        l.add(15);
        l.add(35);
        l.add(21);
        System.out.println("Before sorting");
        for(Object i:l){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After sorting");
        Collections.sort(l);
        for(Object i:l){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Reverse");
        Collections.reverse(l);
        for (Object obj:l){
            System.out.print(obj+" ");
        }

    }
}
