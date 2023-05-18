package DataStructures;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedLists {
    //Reverse linked list example
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(11);
        l.add(10);
        l.add(23);
        l.add(15);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
