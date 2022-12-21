package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("20");
        l.add("sql");
        l.add("Java");
        for(String s:l){
            System.out.println(s);
        }
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(12);
        for(Integer i:ll){
            System.out.println(i);
        }
    }
}
