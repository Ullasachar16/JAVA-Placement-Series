package TwoDimensionalArrays;

import java.util.Scanner;

public class InputtingAndOutputtingArrayElements {
    //Program to Input and Output Array Elements
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int rows=sc.nextInt();
        System.out.println("Enter col size:");
        int cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];

        //input
        //rows
        System.out.println("Enter elements:");
        for(int i=0;i<rows;i++){
            //columns

            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("Elements are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
