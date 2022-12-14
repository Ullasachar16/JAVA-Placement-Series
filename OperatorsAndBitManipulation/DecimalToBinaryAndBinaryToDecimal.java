package OperatorsAndBitManipulation;

import java.util.Scanner;

public class DecimalToBinaryAndBinaryToDecimal {
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
    public static int binaryToDecimal(int n1){
        int num = n1;
        int dec_value = 0;
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number to convert into binary:");
        int n= sc.nextInt();
        decimalToBinary(n);
        System.out.println();
        System.out.println("Enter binary number to convert into decimal number:");
        int n1= sc.nextInt();
        System.out.println(binaryToDecimal(n1));

    }
}
