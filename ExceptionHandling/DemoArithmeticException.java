package ExceptionHandling;

import java.util.Scanner;

public class DemoArithmeticException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println("do not divide by zero");
        }
        sc.close();
    }
}
