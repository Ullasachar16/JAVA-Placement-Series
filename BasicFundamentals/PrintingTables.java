package BasicFundamentals;

import java.util.Scanner;

public class PrintingTables {
    public static void main(String[] args) {
        //print tables according to user's input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which table to print:");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table+" X "+i+" = "+(table*i));
        }
    }
}
