package BasicFundamentals;

import java.util.Scanner;

public class Prerequisites1 {
    //Program to Start with Pre-Requisites
    public static void main(String[] args) {
        //Output
        System.out.print("Hello World with Java\n with Apna College\n");
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
        System.out.println("Enter Value for A :");
        int a1=sc.nextInt();
        System.out.println("Enter Value for B:");
        int b1=sc.nextInt();
        int sum=a1+b1;
        System.out.println("Sum:"+sum);
        //Input
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=s1.nextLine();
        System.out.println("Name is:"+name);
    }
}
