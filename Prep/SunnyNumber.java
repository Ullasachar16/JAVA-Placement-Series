package Prep;

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        int n,n1;
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        n1=n+1;
        x=Math.sqrt(n1);
        if((int)x==x){
            System.out.println("number is sunny number");
        }else {
            System.out.println("number is not a sunny number");
        }
    }
}
