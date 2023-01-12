package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {
    //demo of generics used in collection framework

    public static void main(String[] args) {
        int a=20;
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
        ArrayList<Integer> al=new ArrayList();
        al.add(a);  //l.add(new Integer(10));
        al.add(a+30);  //l.add(new Integer(10+30));
        al.add(a-10);   //l.add(new Integer(10-10));
        for(Integer i:al){
            System.out.println(i);
        }
        LinkedList li=new LinkedList();
        li.add(10);
        li.add(true);
        li.add("java");
        for(Object o:li){
            System.out.println(o);
        }
    }
}
