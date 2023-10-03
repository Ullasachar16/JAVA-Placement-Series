package Patterns;

public class NumberPyramid {
    //Program to Print Number Pyramid pattern
    public static void main(String[] args) {
        //Print Number Pyramid Triangle pattern
        int n=5;
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
