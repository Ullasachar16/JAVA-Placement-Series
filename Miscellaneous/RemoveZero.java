package Miscellaneous;

import java.util.Scanner;

public class RemoveZero {
    //Program to Remove Zeroes that are provided in the input
    public static void main(String[] args) {
        int a,x,b;
        char z;
        String n,k="",str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        str = sc.next();

        x = str.length();

        for(int i=0;i<x;i++){
            z = str.charAt(i);
            if(z=='0'){

            }else
                k+=z;
        }
        System.out.println("Numbers without zero:"+k);
    }
}
