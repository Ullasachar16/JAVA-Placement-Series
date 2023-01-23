package BasicFundamentals;

import java.util.Scanner;

public class SumOfNaturalNumbersN {
    //program to print sum of n natural numbers
    public static void main(String[] args) {
        //print sum of natural number n
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
