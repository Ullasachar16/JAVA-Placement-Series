package Prep;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter # of rows:");
        int row=sc.nextInt();
        System.out.println("Enter # of cols:");
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        System.out.println("enter elements:");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               a[i][j]=sc.nextInt();
           }
        }
        System.out.println("here are those "+(row*col)+ " integers in a "+row+ "x" +col+ "2d-array:");
        System.out.println(Arrays.deepToString(a));
    }
}
