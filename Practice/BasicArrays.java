package Practice;

import java.util.Scanner;

public class BasicArrays {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr=getIntegers(5);
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" , typed value was "+arr[i]);
        }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+ " integer value");
        int[] values=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        return values;
    }

}
