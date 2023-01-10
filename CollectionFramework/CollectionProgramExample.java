package CollectionFramework;

import java.util.ArrayList;

public class CollectionProgramExample {
    //program to implement collection example using arraylist
    public static void main(String[] args) {
        Student s1=new Student(34,"Tom");
        Student s2=new Student(43,"King");
        Student s3=new Student(30,"Scott");
        ArrayList<Student>l=new ArrayList<Student>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        for(Student s:l){
            System.out.println(s);
        }
    }
}
class Student{
    int age;String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "name:"+name+"\nid:"+age;
      }
}
