package Recursion;

public class PrintFactorialOfNumberN {
    //program to print factorial of a number
    public static int printFactorial(int n){
        if(n==1||n==0)
            return 1;
        int fact_nm1=printFactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Factorial:"+printFactorial(n));
    }
}
