package CustomException;

import java.util.Scanner;

public class InsufficientBalanceException extends Exception {
}
class ATM{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Enter amt to be withdrawn:");
        double amount=sc.nextDouble();
        if(amount<=balance){
            System.out.println("Withdrawn successfully");
        }else{
            try {
                throw new InsufficientBalanceException();
            }
            catch (InsufficientBalanceException e){
                System.out.println("Not enough balance to withdraw");
            }
        }
    }
}
