package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceExample {
    //program to show iterator interface
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add(10);
        l.add(30);
        l.add(25);
        l.add(20);
        l.add(35);
        l.add("java");
        l.add(true);
        l.add(35.6);
        Iterator i=l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
