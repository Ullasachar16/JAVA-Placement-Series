package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapInterfaceAllClassesExample {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap();
        h.put("Tom",22);
        h.put("Jerry",21);
        h.put("Doggy",25);
        h.put("bheem",23);
        Set<String>s1=h.keySet();
        for(String key:s1){
            System.out.println(key+" is "+h.get(key)+" years old");
        }
        System.out.println("-------------");
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
        lhm.put(10,"java");
        lhm.put(20,"sql");
        lhm.put(30,"web");
        Set<Integer> s=lhm.keySet();
        for(int key:s){
            System.out.println(key+" --> "+lhm.get(key));
        }
        System.out.println("---------------");
        TreeMap<Integer,Double>t=new TreeMap<>();
        t.put(20,1.5);
        t.put(30,2.5);
        t.put(10,4.5);
        Set<Integer>s2=t.keySet();
        for(Integer key:s2){
            System.out.println(key+" : "+t.get(key));
        }
    }
}
