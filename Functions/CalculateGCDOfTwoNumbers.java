package Functions;

import java.util.Scanner;

public class CalculateGCDOfTwoNumbers {
    public static void printGCD(int n1,int n2){
        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is:"+n2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        printGCD(a,b);
    }
}
