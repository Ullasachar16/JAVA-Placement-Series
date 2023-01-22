package OperatorsAndBitManipulation;

public class SetBit {
    //program to implement setbit
    public static void main(String[] args) {
        //Set Bit
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
