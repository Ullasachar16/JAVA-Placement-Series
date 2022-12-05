package Functions;

import java.util.Scanner;

public class SumOfOddNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter any Number : ");
        int number = sc.nextInt();
        printSumOfOddNum(number);
    }

    public static void printSumOfOddNum(int num) {
        int sum=0;
        for(int i = 1;i <= num;i++) {
            if(i%2!= 0) {
                System.out.print(i + "\t");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("sum is:"+sum);
    }
}
