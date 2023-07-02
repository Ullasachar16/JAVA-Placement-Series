package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    //Program to Check the Number is Armstrong Number or Not
    public static void main(String[] args) {
        int n,sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Check if it is an Armstrong Number");
        n=sc.nextInt();
        temp=n;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(n==sum)
            System.out.println("Entered Number is an Armstrong Number");
        else
            System.out.println("Entered number is not an armstrong number");
    }
}
