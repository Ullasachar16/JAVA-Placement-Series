package OperatorsAndBitManipulation;

import java.util.Scanner;

public class ToggleBitPosition {
    //Program to Toggle-Bit Position
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bit Position:");
        int n=5;
        int pos = sc.nextInt();
        int bitmask= 1<<pos;
        int newNumber = bitmask ^ n;
        System.out.println(newNumber);


    }
}
