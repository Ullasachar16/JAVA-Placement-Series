package CollectionInterface;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    String name;
    Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Name:"+name+"\nSalary:"+salary;
    }
    @Override
    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
       //return e.salary.compareTo(this.salary);
    }
}

public class ComparableInterfaceExample1 {
    public static void main(String[] args) {
        Employee e1=new Employee("Tom",45.5);
        TreeSet<Employee>t=new TreeSet<>();
        t.add(e1);
        t.add(new Employee("King",35.6));
        t.add(new Employee("Scott",25.6));
        t.add(new Employee("Allen",60.4));
        for(Employee e:t){
            System.out.println(e);
        }
    }
}
