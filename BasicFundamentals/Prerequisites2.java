package BasicFundamentals;

import java.util.Scanner;

public class Prerequisites2 {
    public static void main(String[] args) {
        //datatypes
       /* int age=20;
        double height = 4.5;
        byte a=2;
        short b=3;
        float c=3.4f;
        long d=10;
        char e='a';
        boolean f=true; */
        //program to calculate area of circle
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of the circle");
        double radius=sc.nextDouble();
        double pi=3.141592653589793238;
        double area=pi*(radius*radius);
        System.out.println("Area of Circle:"+area);
    }
}
