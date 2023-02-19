package Functions;

import java.util.Scanner;

public class CircumferenceOfCircle {
    //Program to calculate circumference of a circle
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double radius=sc.nextDouble();
        printCircumferenceOfCircle(radius);
    }
    public static void printCircumferenceOfCircle(double radius){
        double pi=3.141592653589793238462643;
        double circumferenceOfCircle=2*pi*radius;
        System.out.println("circumferenceOfCircle is:"+circumferenceOfCircle);
    }
}
