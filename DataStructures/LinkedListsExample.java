package DataStructures;

import java.util.LinkedList;

public class LinkedListsExample {
    //Linked List Example
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.add(5);
        l.add(7);
        l.add(3);
        l.addFirst(1);
        l.addLast(8);
        l.add(2);
        l.add(3);
        int index=0;
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            index=l.indexOf(7);
        }
        System.out.println("Index:"+index);
    }
}
