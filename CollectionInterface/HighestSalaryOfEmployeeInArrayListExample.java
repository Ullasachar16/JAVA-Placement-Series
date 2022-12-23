package CollectionInterface;

import java.util.ArrayList;

class Emp{
    String name;
    double salary;
    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Salary of "+name+" is Rs "+salary;
    }
}
public class HighestSalaryOfEmployeeInArrayListExample {
    public static void main(String[] args) {
        Emp e1=new Emp("Tom",45000);
        ArrayList<Emp> l=new ArrayList<>();
        l.add(e1);
        l.add(new Emp("Jack",35000));
        l.add(new Emp("King",60000));
        l.add(new Emp("Scott",40000));
        for(Emp e:l){
            System.out.println(e);
        }
        System.out.println("------------------------");
        System.out.println("Highest salary Employee");
        Emp max=l.get(0);
        for(int i=1;i<l.size();i++){
            if(l.get(i).salary>max.salary){
                max=l.get(i);
            }
        }
        System.out.println("Max salary:"+max);
        System.out.println("-----------OR-------------");
        for(Emp e:l){
            if(e.salary>max.salary){
                max=e;
            }
        }
        System.out.println("Max salary:"+max);
    }
}