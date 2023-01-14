package Functions;

import java.util.Scanner;

public class EvenOrNot {
    //program to check even or not
    public static void isEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        isEven(n);
    }
}
