package Arrays;

import java.util.Scanner;

public class PrintArrayNames {
    //Program to Print Array Names inputted by the User
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size= sc.nextInt();
        String names[]=new String[size];
        System.out.println("Enter Names:");
        for(int i=0;i<size;i++){
            names[i]= sc.next();
        }
        System.out.println("Names are:");
        for(int i=0;i< names.length;i++){
            System.out.println("Name "+(i+1) +" is: "+names[i]);
        }
    }
}
