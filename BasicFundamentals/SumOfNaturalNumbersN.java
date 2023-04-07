package BasicFundamentals;

import java.util.Scanner;

public class SumOfNaturalNumbersN {
    //Program to Print Sum of N Natural Numbers
    public static void main(String[] args) {
        //Print Sum of natural number n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int sum=0;
      for(int i=1;i<=n;i++){
          sum=sum+i;
      }
        System.out.println("sum:"+sum);
    }
}
