package OperatorsAndBitManipulation;

public class GetBit {
    //Program to Show the Implementation of getbit
    public static void main(String[] args) {
        //Get Bit
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }
    }
}
