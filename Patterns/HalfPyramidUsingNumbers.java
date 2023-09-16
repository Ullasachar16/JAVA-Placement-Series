package Patterns;

public class HalfPyramidUsingNumbers {
    //Program to Print Half Pyramid Pattern using Numbers
    public static void main(String[] args) {
        /* Print Half Pyramid pattern using numbers
                    1
                    1 2
                    1 2 3
                    1 2 3 4
         */
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
