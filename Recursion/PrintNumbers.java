package Recursion;

public class PrintNumbers {
    //Program to Print Numbers from 1 to 5
    //print numbers from 5 to 1
    public static void printNumber(int n){
        if(n==0)
            return;
        System.out.print(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
        System.out.println();
        n=1;
        printNumbers(n);

    }
    //print numbers from 1 to 5
    public static void printNumbers(int n){
        if(n==6)
            return;
        System.out.print(n);
        printNumbers(n+1);
    }
}
