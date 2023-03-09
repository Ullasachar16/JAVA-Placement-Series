package Recursion;

import java.util.Scanner;

public class HCFAndLCM {
    //Program to find hcf and lcm of numbers
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();

        int h=1;
        int p=m*n;

        for(int i=2;i<p;i++){
            if((m%i==0)&&(n%i==0)){
                h=i;
            }
        }
        int i=p/h;
        System.out.println("HCF is:"+h+" and LCM is:"+i);
    }
}
