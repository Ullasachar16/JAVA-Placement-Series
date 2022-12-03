package Functions;

import java.util.Scanner;

public class PrintingTables {
    public static void printTables(int table){
        for(int i=1;i<=10;i++){
            System.out.println(table+" X "+i+" = "+(table*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which table to print:");
        int table=sc.nextInt();
        printTables(table);
    }
}
