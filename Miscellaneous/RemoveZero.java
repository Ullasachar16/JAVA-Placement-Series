package Miscellaneous;

import java.util.Scanner;

public class RemoveZero {
    //Program to Remove Zeroes that are Provided in the Input
    public static void main(String[] args) {
        int a,x,b;
        char z;
        String n,k="",str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        str = sc.next();

        x = str.length();

        for(int i=0;i<x;i++){
            z = str.charAt(i);
            if(z=='0'){

            }else
                k+=z;
        }
        System.out.println("Numbers Without Zero:"+k);
    }
}
