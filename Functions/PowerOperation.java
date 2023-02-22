package Functions;

import java.util.Scanner;

public class PowerOperation {
    //Program to show the power operation of a number entered by the user
    public static void printPowerOperation(int x,int n){
        int result=1;
        for(int i=1; i<=n; i++) {
            result = result * x;
        }
        System.out.println("x to the power n is : "+ result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base value:");
        int x=sc.nextInt();
        System.out.println("Enter the exponent value:");
        int n=sc.nextInt();
        printPowerOperation(x,n);
    }
}
