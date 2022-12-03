package Functions;

import java.util.Scanner;

public class SumOfOddNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter any Number : ");
        int number = sc.nextInt();
        printSumOfOddNum(number);
    }

    public static void printSumOfOddNum(int num) {
        for(int i = 1;i <= num;i++) {
            if(i%2!= 0) {
                System.out.print(i+"\t");
            }
        }
    }
}
