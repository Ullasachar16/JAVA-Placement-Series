package OOPS;

public class Employee {
    //Example of constructor with method
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(name+" "+id+" "+salary);
    }
}
class Solution{
    public static void main(String[] args) {
        Employee e1=new Employee(101,"tom",4.5);
        Employee e2=new Employee(104,"jack",3.5);
        Employee e3=new Employee(102,"king",6.7);
        Employee e4=new Employee(103,"scott",5.8);
        Employee[] e={e1,e2,e3,e4};
        for(int i=0;i<e.length;i++){
            e[i].display();
        }
        Employee min=e[0];
        for(int i=1;i<e.length;i++){
            if(e[i].salary<min.salary){
                min=e[i];
            }
        }
        System.out.println("lowest salary:");
        System.out.println(min.id+" "+min.name+" "+min.salary);

    }
}