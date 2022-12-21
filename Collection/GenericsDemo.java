package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsDemo {

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
        al.add(a);
        al.add(a+30);
        al.add(a-10);
        for(Integer i:al){
            System.out.println(i);
        }
    }
}
