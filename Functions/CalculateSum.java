package Functions;

import java.util.Scanner;

public class CalculateSum {
    //program to calculate sum
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int calculateMul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("sum:"+sum);
        int mul=calculateMul(a,b);
        System.out.println("mul:"+mul);

    }
}
