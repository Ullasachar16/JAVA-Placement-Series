package Functions;

import java.util.Scanner;

public class GreaterOfTwo {
    //Program to find greater among two numbers entered ny the user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value 1:");
        int a= sc.nextInt();
        System.out.println("Enter value 2:");
        int b=sc.nextInt();
        printGreaterOfTwo(a,b);

    }
    public static void printGreaterOfTwo(int a,int b){
        if(a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }
    }
}
