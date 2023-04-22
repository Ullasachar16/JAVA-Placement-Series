package CollectionFramework;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        //Demo Program of arraylist
        //pre-defined methods of list interface and arraylist class
        ArrayList l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(null);
        l.add(10);
        l.add("java");
        System.out.print(l+"\n");
        System.out.println("-----------");
        System.out.println(l.size());
        System.out.println("------------");
        System.out.println(l.get(2));
        System.out.println("-------------");
        System.out.println(l.contains("java"));
        System.out.println(l.contains("Java"));
        System.out.println("--------------");
        l.remove(2);
        System.out.println(l);
        System.out.println(l.isEmpty());
        ArrayList x=new ArrayList();
        x.add(20);
        x.add(20);
        x.add(20); x.add(10); x.add(20);
        x.add(20);
        x.add(10);
        System.out.println(x.indexOf(10));
        System.out.println(x.lastIndexOf(10));
        l.add(2,40);
        System.out.println(l);
        l.set(2,30);
        System.out.println(l);
        l.clear();
        System.out.println(l);



    }
}
