package CustomException;

import java.util.Scanner;

public class InsufficientBalanceExceptionInCheckException extends Exception {
}
class ATM{
    //program to implement insufficientbalance exception using check exception
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Enter amt to be withdrawn:");
        double amount=sc.nextDouble();
        if(amount<=balance){
            System.out.println("Withdrawn successfully");
        }else{
            try {
                throw new InsufficientBalanceExceptionInCheckException();
            }
            catch (InsufficientBalanceExceptionInCheckException e){
                System.out.println("Not enough balance to withdraw");
            }
        }
    }
}
