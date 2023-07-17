package Practice;

import java.util.Scanner;

public class MinimumElementChallenge {
    //Program to find Minimum Element in an array
    //To find Minimum Element in an Array
    private static Scanner sc=new Scanner(System.in);
    private static int[] readIntegers(int count){
        int[] array=new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter a number:");
            int number=sc.nextInt();
            sc.nextLine();
            array[i]=number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count=sc.nextInt();
        sc.nextLine();

        int[] returnedArray=readIntegers(count);
        int returnedMin=findMin(returnedArray);
        System.out.println("Min: "+returnedMin);
    }
}
