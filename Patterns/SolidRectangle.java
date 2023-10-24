package Patterns;

import java.util.Scanner;

public class SolidRectangle {
    //Program to Print Solid Rectangle pattern
    public static void main(String[] args) {
        //Printing solid rectangle pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        System.out.println("enter no of columns");
        int m=sc.nextInt();
        //Outer loop for Rows
        for(int i=1;i<=n;i++){
            //Inner loop for Columns
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
