package BasicFundamentals;

import java.util.Scanner;

public class PrintingEvenNumbersTillN {
    //Program to Print Even numbers till n using scanner class
    public static void main(String[] args) {
        //print all even numbers till n
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
