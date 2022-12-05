package Arrays;

import java.util.Scanner;

public class MaxAndMinNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size= sc.nextInt();
        int ele[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            ele[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("min and max elements in array are:");
        for(int i=0;i< ele.length;i++){
            if(ele[i]<min){
                min=ele[i];
            }
            if(ele[i]>max){
                max=ele[i];
            }
        }
        System.out.println("MAX element is:"+max);
        System.out.println("MIN element is:"+min);

    }
}
