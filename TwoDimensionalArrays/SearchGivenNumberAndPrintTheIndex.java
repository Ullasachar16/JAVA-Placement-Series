package TwoDimensionalArrays;

import java.util.Scanner;

public class SearchGivenNumberAndPrintTheIndex {
    //Program to Search given number Inputted by the user and Print the Index of the Element
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row elements:");
        int rows= sc.nextInt();
        System.out.println("Enter col elements:");
        int cols=sc.nextInt();
        int numbers[][]=new int[rows][cols];

        //Input
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter search element:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at locations:("+i+ ","+j+")");
                }
            }
        }
    }
}
