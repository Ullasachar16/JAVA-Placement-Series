package TwoDimensionalArrays;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row elements:");
        int rows=sc.nextInt();
        System.out.println("Enter col elements:");
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];
        //input
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is:");
        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=cols-1;
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(numbers[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(numbers[row][colEnd] +" ");
            }
            colEnd--;

            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(numbers[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(numbers[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }

    }
}
