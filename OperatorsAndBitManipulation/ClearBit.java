package OperatorsAndBitManipulation;

public class ClearBit {
    //Program to Show How to Clear the Bit
    public static void main(String[] args) {
        //Clear Bit
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber1 = notBitMask & n;
        System.out.println(newNumber1);
    }
}
