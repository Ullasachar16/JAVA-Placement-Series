package Arrays;

import java.util.Scanner;

public class MaxAndMinNumberInArray {
    //Program to find Max and Min Number in Array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size= sc.nextInt();
        int ele[]=new int[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++){
            ele[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("Min and Max elements in array are:");
        for(int i=0;i< ele.length;i++){
            if(ele[i]<min){
                min=ele[i];
            }
            if(ele[i]>max){
                max=ele[i];
            }
        }
        System.out.println("MAX Element is:"+max);
        System.out.println("MIN Element is:"+min);

    }
}
