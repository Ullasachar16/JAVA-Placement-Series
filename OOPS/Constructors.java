package OOPS;

import java.util.Scanner;

public class Constructors {
   int id;
   String name;
   double marks;

    public Constructors(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id,name,marks");
        int id= sc.nextInt();
        String name=sc.next();
        double marks=sc.nextDouble();
        Constructors c=new Constructors(id,name,marks);
        System.out.println(c.id+" "+c.name+" "+c.marks);
    }
}