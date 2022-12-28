package Prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NeonNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num;
        int square;
        int sum=0;
        System.out.println("Enter any number:");
        num=Integer.parseInt(br.readLine());
        square=num*num;

        String sqs=Integer.toString(square);
        for(int i=0;i<sqs.length();i++){
            sum+=Integer.parseInt(sqs.substring(i,i+1));
        }
        if(sum==num)
            System.out.println(num+" is a Neon Number");
        else
            System.out.println(num+" is not a Neon Number");
    }
}
