package CollectionFramework;

import java.util.ArrayList;

public class DemoArrayList1 {
    //Demo Program of Arraylist
    public static void main(String[] args) {
        ArrayList x=new ArrayList();
        x.add(10);
        x.add("java");
        x.add(10);
        x.add("sql");
        x.add(20);
        x.add(30);
        x.add(34.5);
        x.add('A');
        x.add(true);
        System.out.println(x);
        for(int i=0;i<x.size();i++){
            System.out.print(x.get(i)+",");
        }
        System.out.println();
        for(int i=x.size()-1;i>=0;i--){
            System.out.print(x.get(i)+",");
        }
        System.out.println();
        ArrayList l=new ArrayList(x);
        l.add(40);
        l.set(8,"web");
        System.out.println(l);

    }
}
