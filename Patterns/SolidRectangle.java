package Patterns;

import java.util.Scanner;

public class SolidRectangle {
    //program to print solid rectangle pattern
    public static void main(String[] args) {
        //Printing solid rectangle pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
