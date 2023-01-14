package Functions;

import java.util.Scanner;

public class Factorial {
    //program to find the factorial of a number
    public static void printfactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        printfactorial(n);
    }
}
