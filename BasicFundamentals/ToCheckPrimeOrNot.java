package BasicFundamentals;

import java.util.Scanner;

public class ToCheckPrimeOrNot {
    //Program to Check The Number is Prime or Not
    public static void main(String[] args) {
        //program to check whether a number is prime or not
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
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
}


