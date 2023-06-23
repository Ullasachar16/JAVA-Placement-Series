package Arrays;

import java.util.Scanner;

public class Basic1 {
    //Getting Array Input from the Users and Printing it
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
