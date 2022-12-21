package Collection;

import java.util.LinkedList;

public class DemoLinkedList{
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
}
