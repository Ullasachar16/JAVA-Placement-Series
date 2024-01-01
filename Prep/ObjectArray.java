package Prep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee2 {
    //Program to Implement BufferedReader and Exception
        String name;
        int emp_id;
        int salary;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void getData(){
        try{
            System.out.print("Enter Name:\n");
            name=br.readLine();
            System.out.println("Enter Emp Id:");
            emp_id= Integer.parseInt(br.readLine());
            System.out.println("Enter Salary:");
            salary=Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("\n"+e);
        }
    }
    public void display(){
        System.out.println("\nName:"+name);
        System.out.println("\nEmp_id:"+emp_id);
        System.out.println("\nSalary:"+salary);
    }
}
class ObjectArray{
    public static void main(String[] args) {
        int i;
        Employee2 emp[]=new Employee2[3];
        for(i=0;i< emp.length;i++){
            emp[i]=new Employee2();
        }
        for(i=0;i< emp.length;i++){
            System.out.println("\nEnter Employee Details:"+(i+1));
            emp[i].getData();
        }
        for(i=0;i< emp.length;i++){
            System.out.println("\ndetails of employee"+(i+1)+" is:");
            emp[i].display();
        }
    }
}
