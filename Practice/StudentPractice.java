package Practice;

public class StudentPractice {
    //Program to Implement Constructor Overloading
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
    //Main Class for Constructor Overloading
    public static void main(String[] args) {
        StudentPractice s1=new StudentPractice();
        s1.setAge(35);
        s1.setName("Tom");
        System.out.println("Id:"+s1.age+"\nName:"+s1.name);
    }
}