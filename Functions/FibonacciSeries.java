package Functions;

import java.util.Scanner;

public class FibonacciSeries {
    //program to find fibonacci series
    public static void printFibonacci(int n){
        int a=0,b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int n=sc.nextInt();
        printFibonacci(n);
    }
}
