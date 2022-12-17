package OOPS;

import java.util.Scanner;

public class StudentEncapsulation {
    private int age;
    public void setAge(int age){
        if(age>0){
            System.out.println("age is initialized");
        }else{
            System.out.println("age not initialized");
        }
    }
    public int getAge(int age){
        return age;
    }
}
class MainClass1{
    public static void main(String[] args) {
        StudentEncapsulation s=new StudentEncapsulation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        s.setAge(age);
        System.out.println("age is:"+s.getAge(age));

    }
}