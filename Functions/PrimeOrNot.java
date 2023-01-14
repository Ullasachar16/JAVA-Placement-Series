package Functions;

import java.util.Scanner;

public class PrimeOrNot {
    //program to check prime or not
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num:");
        int n= sc.nextInt();
        if(isPrime(n)){
            System.out.println("It is Prime NUmber");
        }else{
            System.out.println("Not a Prime NUmber");
        }
    }
}
