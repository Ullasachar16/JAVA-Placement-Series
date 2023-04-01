package BasicFundamentals;

import java.util.Scanner;

public class Prerequisites2 {
    //Basic Program to Show the Usage of Data-Types
    public static void main(String[] args) {
        //Data-Types
       /* int age=20;
        double height = 4.5;
        byte a=2;
        short b=3;
        float c=3.4f;
        long d=10;
        char e='a';
        boolean f=true; */
        //Program to Calculate Area of Circle
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of the Circle");
        double radius=sc.nextDouble();
        double pi=3.141592653589793238;
        double area=pi*(radius*radius);
        System.out.println("Area of Circle:"+area);
    }
}
