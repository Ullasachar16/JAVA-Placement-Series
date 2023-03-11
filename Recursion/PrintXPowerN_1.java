package Recursion;

public class PrintXPowerN_1 {
    //Program to print x power n example 1
    //stack height = log n
    public static int calcPower(int x,int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){ //base case 2
            return 0;
        }
        //if n is even
        if(n%2==0){
            return calcPower(x,n/2)*calcPower(x,n/2);
        }else { //if n is odd
            return calcPower(x,n/2)*calcPower(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(calcPower(x,n));
    }
}
