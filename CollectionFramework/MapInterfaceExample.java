package CollectionFramework;

import java.util.*;

class Student2{
    String name;
    String subject;
    public Student2(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
public class MapInterfaceExample {
    public static void main(String[] args) {
        Student2 s1=new Student2("Jack","Python");
        HashMap<Student2,Integer> h=new HashMap<>();
        h.put(s1,85);
        h.put(new Student2("John","Java"),75);
        h.put(new Student2("Tom","JavaScript"),65);
        Set<Student2>s=h.keySet();
        for(Student2 obj:s){
            System.out.println(obj.name+ " has scored "+h.get(obj)+" marks in "+obj.subject);
        }
    }
}
