package Recursion;

import java.util.Scanner;

public class Factorial1 {
    //Program to check factorial of a given number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to know its factorial:");
        int a= sc.nextInt();
        System.out.println("Factorial of "+a+" is "+fact(a));
    }
    public static int fact(int n){
        int result;
        if(n==0||n==1)
            return 1;
        result=fact(n-1)*n;
        return result;
    }
}
