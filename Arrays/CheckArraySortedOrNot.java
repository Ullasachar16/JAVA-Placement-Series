package Arrays;

import java.util.Scanner;

public class CheckArraySortedOrNot {
    //Program to check the array is sorted or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int ele[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            ele[i]= sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i< ele.length-1;i++){
            if(ele[i]>ele[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
