package Practice;

public class StudentPractice {
    //program to implement constructor chaining
    int age;
    String name;
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
class Soluto{
    //main class for constructor overloading
    public static void main(String[] args) {
        StudentPractice s1=new StudentPractice();
        s1.setAge(35);
        s1.setName("Tom");
        System.out.println("id:"+s1.age+"\nname:"+s1.name);
    }
}