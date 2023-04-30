package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class VectorAndStackExample {
    //Vector and Stack Example Program Using Collections
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        System.out.println(al);
        LinkedList ll=new LinkedList(al);
        ll.add(20);
        ll.add(30);
        System.out.println(ll+" ");
        Vector v=new Vector(ll);
        v.add("sql");
        v.add(true);
        System.out.println(v+" ");
        Stack s=new Stack();
        s.push(30);
        s.push(20);
        s.push(10);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
