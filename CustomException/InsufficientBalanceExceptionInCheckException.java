package CustomException;

import java.util.Scanner;

public class InsufficientBalanceExceptionInCheckException extends Exception {
}
class ATM{
    //Program to Implement Insufficient-Balance-Exception using Check Exception
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Enter Amount to be Withdrawn:");
        double amount=sc.nextDouble();
        if(amount<=balance){
            System.out.println("Withdrawn Successfully");
        }else{
            try {
                throw new InsufficientBalanceExceptionInCheckException();
            }
            catch (InsufficientBalanceExceptionInCheckException e){
                System.out.println("Not Enough Balance to Withdraw");
            }
        }
    }
}
