package TwoDimensionalArrays;

import java.util.Scanner;

public class InputtingAndOutputtingArrayElements {
    //Program to Input and Output Array Elements
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size:");
        int rows=sc.nextInt();
        System.out.println("Enter col size:");
        int cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];

        //Input
        //Rows
        System.out.println("Enter elements:");
        for(int i=0;i<rows;i++){
            //Columns

            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //Output
        System.out.println("Elements are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
