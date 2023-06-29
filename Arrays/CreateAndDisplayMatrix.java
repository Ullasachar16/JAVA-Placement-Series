package Arrays;

import java.util.Scanner;

class Matrix_Create{
    //Program to Create Matrix using Arrays and Print it
    Scanner scan;
    int matrix[][];
    int row,column;

    void create(){
        scan =new Scanner(System.in);
        System.out.println("Matrix Creation");
        System.out.println("Enter No of Rows");
        row=Integer.parseInt(scan.nextLine());
        System.out.println("Enter No of columns");
        column = Integer.parseInt(scan.nextLine());

        matrix=new int[row][column];
        System.out.println("Enter the Data");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
            }
    void display(){
        System.out.println("\nThe Matrix is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }

    }
}
public class CreateAndDisplayMatrix {
    public static void main(String[] args) {
        Matrix_Create obj=new Matrix_Create();
        obj.create();
        obj.display();
    }

}
