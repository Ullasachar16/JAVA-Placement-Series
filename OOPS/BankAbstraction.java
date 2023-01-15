package OOPS;

import java.util.Scanner;

public interface BankAbstraction {
    //program to show the implementation and usage of interface
    void deposit(int amount);
    void withdraw(int amount);
    void checkBalance();
}
class ATM implements BankAbstraction{
    int balance=10000;
    @Override
    public void deposit(int amount){
        System.out.println("Depositing Amount");
        balance=balance+amount;
        System.out.println("Amount deposited successfully");
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Withdrawing Amount");
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully");
        }
    }
    public void checkBalance(){
        System.out.println("Available Balance:Rs."+balance);
    }
}
class AccountHolder1{
    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        System.out.println("----------------------------");
        Scanner sc=new Scanner(System.in);
        BankAbstraction b=new ATM(); //Upcasting
        while(true){
            System.out.println("1.Deposit\t2.Withdraw\t3.Check Balance\t4.Exit");
            System.out.println("Enter Choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Amount to be deposited");
                    int dAmt= sc.nextInt();
                    b.deposit(dAmt);
                    break;
                case 2:
                    System.out.println("Enter Amount to be withdrawn");
                    b.withdraw(sc.nextInt());
                    break;
                case 3:
                    b.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You!!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}