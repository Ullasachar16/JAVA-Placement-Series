package Patterns;

import java.util.Scanner;

public class SolidRectangle {
    //Program to Print Solid Rectangle Pattern
    public static void main(String[] args) {
        //Printing Solid Rectangle Pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int n=sc.nextInt();
        System.out.println("Enter No of Columns");
        int m=sc.nextInt();
        //Outer Loop for Rows
        for(int i=1;i<=n;i++){
            //Inner Loop for Columns
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
