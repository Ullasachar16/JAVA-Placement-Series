package BasicFundamentals;

import java.util.*;

public class ToCheckPrimeOrNot1 {
    //Program to Check Prime or Not Another Example
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            if(n == 1) {
                System.out.println("This is Neither Prime not Composite");
            } else {
                System.out.println("This is a Prime Number");
            }
        } else {
            System.out.println("This is Not a Prime Number");
        }
    }
}

