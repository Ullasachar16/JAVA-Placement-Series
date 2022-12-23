package CollectionInterface;

import java.util.Comparator;
import java.util.TreeSet;

class Student1{
    int age;
    String name;
    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Age:"+age+"\nName:"+name;
    }
}
class SortByAge implements Comparator<Student1>{
    @Override
    public int compare(Student1 x,Student1 y){
        return x.age-y.age;
    }
}
class SortByName implements Comparator<Student1>{
    @Override
    public int compare(Student1 x,Student1 y){
        return y.name.compareTo(x.name);
    }
}
public class ComparatorInterfaceExample {
    public static void main(String[] args) {
        Student1 s1=new Student1(23,"Scott");
        Student1 s2=new Student1(24,"King");
        Student1 s3=new Student1(22,"Allen");
        Student1 s4=new Student1(30,"Zack");
        TreeSet<Student1>t=new TreeSet<Student1>(new SortByName());
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        for(Student1 s:t){
            System.out.println(s);
        }

    }
}
