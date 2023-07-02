package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    //Program to Check the Number is Armstrong Number or Not
    public static void main(String[] args) {
        int n,sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to check if it is an armstrong number");
        n=sc.nextInt();
        temp=n;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(n==sum)
            System.out.println("Entered number is an armstrong number");
        else
            System.out.println("Entered number is not an armstrong number");
    }
}
