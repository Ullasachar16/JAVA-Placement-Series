package TwoDimensionalArrays;

import java.util.Scanner;

public class TransposeMatrix {
    //program to implement transpose matrix
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row elements:");
        int rows=sc.nextInt();
        System.out.println("Enter col elements:");
        int cols= sc.nextInt();
        int numbers[][]=new int[rows][cols];
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix is:");
        //to print transpose
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
