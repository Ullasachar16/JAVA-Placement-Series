package BasicFundamentals;

import java.util.Scanner;

public class PrintingTablesBasic {
    //Program to Print tables according to users input
    public static void main(String[] args) {
        //print tables According to user's input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which table to print:");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table+" X "+i+" = "+(table*i));
        }
    }
}
