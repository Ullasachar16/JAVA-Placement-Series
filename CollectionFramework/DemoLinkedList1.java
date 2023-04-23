package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList1 {
    //Another Demo program for linked-list
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al+"\nSize:"+al.size());
        LinkedList ll=new LinkedList();
        ll.addAll(al);
        ll.add(40);
        System.out.println(ll+"\nSize:"+ll.size());
        System.out.println(ll.containsAll(al));
        ll.remove(2);
        System.out.println(ll.containsAll(al));
        ll.removeAll(al);
        System.out.println(ll);
        System.out.println(ll.isEmpty());


    }
}
