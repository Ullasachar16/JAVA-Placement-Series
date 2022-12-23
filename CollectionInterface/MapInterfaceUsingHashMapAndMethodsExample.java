package CollectionInterface;

import java.util.HashMap;

public class MapInterfaceUsingHashMapAndMethodsExample {
    public static void main(String[] args) {
        HashMap h=new HashMap();
        //put() is used to add key and value inside map
        h.put(10,"dinga");
        h.put("guldu",10.45);
        h.put(1.2,100);
        System.out.println(h);

        System.out.println("------------------");
        //get() is used to get an value based on the key specified
        System.out.println(h.get(10));
        System.out.println(h.get("guldu"));
        System.out.println("---------------------");
        System.out.println(h.containsKey("guldu"));
        System.out.println(h.containsKey(1.2));
        System.out.println(h.containsValue("guldu"));
        System.out.println(h.containsValue(100));
        System.out.println("--------------------");
        System.out.println(h);
        System.out.println(h.remove(10));
        h.clear();
        System.out.println(h);
    }
}
