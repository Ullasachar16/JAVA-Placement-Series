package BasicFundamentals;

import java.util.Scanner;

public class Prerequisites1 {
    //Program to Start with Pre-Requisites
    public static void main(String[] args) {
        //Output
        System.out.print("Hello World with Java\n with Apna college\n");
        System.out.print("Hello World with Java\n");
        //Variables
        int a=10;
        int b=5;
        int res=2*(a+b);
        System.out.println(res);
        int ans=(a*b)/(a-b);
        System.out.println(ans);
        //Assignment Question
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for a :");
        int a1=sc.nextInt();
        System.out.println("enter value for b:");
        int b1=sc.nextInt();
        int sum=a1+b1;
        System.out.println("sum:"+sum);
        //Input
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a name:");
        String name=s1.nextLine();
        System.out.println("name is:"+name);
    }
}
