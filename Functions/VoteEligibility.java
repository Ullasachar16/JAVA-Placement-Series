package Functions;

import java.util.Scanner;

public class VoteEligibility {
    //Program to check vote eligibility of a person by age
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age= sc.nextInt();
        if(isEligibleToVote(age)){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Have patience kid!!");
        }
    }
    public static boolean isEligibleToVote(int age){
        if(age>=18){
            return true;
        }else {
            return false;
        }
    }
}
