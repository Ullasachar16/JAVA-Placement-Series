package Arrays;

import java.util.Scanner;

public class CheckArraySortedOrNot {
    //Program to Check the Array is Sorted or Not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size=sc.nextInt();
        int ele[]=new int[size];
        System.out.println("Enter Array Elements:");
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
            System.out.println("Array is Sorted in Ascending Order");
        }else{
            System.out.println("Array is Not Sorted in Ascending Order");
        }
    }
}
