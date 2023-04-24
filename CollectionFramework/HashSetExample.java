package CollectionFramework;

import java.util.HashSet;

public class HashSetExample {
    //Example Program of HashSet
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add(20);
        h.add(null);
        h.add(20);
        h.add(true);
        h.add("java");
        System.out.println(h.size());
        System.out.println(h);
        for(Object obj:h){
            System.out.println(obj);
        }
    }
}
