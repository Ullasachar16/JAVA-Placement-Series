package Recursion;

import java.util.Scanner;

public class FibonacciSeries1 {
    //Program to find fibonacci series
    public static int fibo(int n){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fibonacci Term:");
        int n=sc.nextInt();
        System.out.print("Fibonacci Series is:\n");
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
