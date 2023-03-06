package Practice;

import java.util.Scanner;

public class BasicArrays {
    //Program to Implement Basic Arrays
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //Main function
        int[] arr=getIntegers(5);
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" , typed value was "+arr[i]);
        }
        System.out.println("The average is "+getAverage(arr));
    }
    public static int[] getIntegers(int number){
        //to get integers from array
        System.out.println("Enter "+number+ " integer value");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        //to get average
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }

}
