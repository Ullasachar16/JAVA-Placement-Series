package BasicFundamentals;

import java.util.Scanner;

public class PrintingEvenNumbersTillN {
    //program to print even numbers till n
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
