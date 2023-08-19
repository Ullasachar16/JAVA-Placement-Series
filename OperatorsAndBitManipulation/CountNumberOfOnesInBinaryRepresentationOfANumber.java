package OperatorsAndBitManipulation;

import java.util.Scanner;

public class CountNumberOfOnesInBinaryRepresentationOfANumber {
    //Program to Count Number of Ones in binary representation of a number
    public static int countBits(int number) {
        if (number == 0) {
            return number;
        } int count = 0;
        while (number != 0) {
            number &= (number - 1);
            count++;
        }
        return count;
    }
    public static void decimalToBinary(int n){
        int[] binaryNum = new int[1000];
        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number to convert into binary:");
        int n= sc.nextInt();
        decimalToBinary(n);
        System.out.println();
        System.out.println(countBits(n));
    }
}
