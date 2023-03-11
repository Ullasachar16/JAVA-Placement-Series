package Recursion;

public class PrintXPowerN_1 {
    //Program to Print X power N example 1
    //Stack Height = log n
    public static int calcPower(int x,int n){
        if(n==0){ //Base case 1
            return 1;
        }
        if(x==0){ //Base case 2
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
