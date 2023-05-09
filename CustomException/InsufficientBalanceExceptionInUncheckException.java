package CustomException;

import java.util.Scanner;

public class InsufficientBalanceExceptionInUncheckException extends RuntimeException {
    private String message;
    InsufficientBalanceExceptionInUncheckException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
class ATM1{
    //Program to Implement Insufficient-Balance-exception using uncheck exception
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Enter amount to be withdrawn:");
        double amount= sc.nextDouble();
        if(amount<=balance){
            System.out.println("Withdrawn successfully");
        }else {
            try {
                throw new InsufficientBalanceExceptionInUncheckException("Insufficient Funds!!!");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
