package BasicFundamentals;

import java.util.Scanner;

public class PrintingEvenNumbersTillN {
    //Program to Print Even Numbers Till N using Scanner Class
    public static void main(String[] args) {
        //Print All Even Numbers Till N
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
