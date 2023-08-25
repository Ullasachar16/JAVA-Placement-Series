package OperatorsAndBitManipulation;

public class GetBit {
    //Program to Show the Implementation of GetBit
    public static void main(String[] args) {
        //Get Bit
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("Bit was Zero");
        }else {
            System.out.println("Bit was one");
        }
    }
}
