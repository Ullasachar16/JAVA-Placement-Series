package Prep;

import java.util.Arrays;

public class ArraySort {
    //Program to Sort the array
    public static void main(String[] args) {
        String arr[]={"java","sql","c","c++","dart","web","android","go","lang"};
        System.out.println("Before Sorting");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nafter sorting");
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
