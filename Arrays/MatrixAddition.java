package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    Scanner scan;
    int matrix1[][],matrix2[][],sum[][];
    int row,column;
    void create(){
        scan=new Scanner(System.in);
        System.out.println("Matrix Addition");
        //First Matrix Creation
        System.out.println("Enter number of rows and columns");
        row=Integer.parseInt(scan.nextLine());
        column=Integer.parseInt(scan.nextLine());
        matrix1=new int[row][column];
        matrix2=new int[row][column];
        sum=new int[row][column];
        System.out.println("Enter the data for first matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix1[i][j]=scan.nextInt();
            }
        }
        //Second Matrix Creation
        System.out.println("Enter the data for second matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix2[i][j]=scan.nextInt();
            }
        }

    }
    void display(){
        System.out.println("\n The First Matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("\t"+matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n The Second Matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("\t"+matrix2[i][j]);
            }
            System.out.println();
        }
    }
    void add(){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("\n The Sum is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("\t"+sum[i][j]);
            }
            System.out.println();
        }
    }
}
class MatrixAdditionExample{
    public static void main(String[] args) {
        MatrixAddition matrix_addition=new MatrixAddition();
        matrix_addition.create();
        matrix_addition.display();
        matrix_addition.add();
    }
}
