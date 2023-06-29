package Arrays;

import java.util.Scanner;

public class PrintArrayNames {
    //Program to print array names inputted by the user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size= sc.nextInt();
        String names[]=new String[size];
        System.out.println("Enter names:");
        for(int i=0;i<size;i++){
            names[i]= sc.next();
        }
        System.out.println("Names are:");
        for(int i=0;i< names.length;i++){
            System.out.println("name "+(i+1) +" is: "+names[i]);
        }
    }
}
