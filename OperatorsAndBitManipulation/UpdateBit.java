package OperatorsAndBitManipulation;

import java.util.Scanner;

public class UpdateBit {
    //Program to Update Bit
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Operation 1 or 0:");
        int oper= sc.nextInt();
        int n=5;  //0101 -> 0111 ->dec 7
        int pos=1;
        //int oper=1; //Update Bit to 1 else update bit to 0
        int bitMask=1<<pos;

        if(oper==1){
            //Set
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            //Clear
            int newBitMask=~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);


        }



    }
}
