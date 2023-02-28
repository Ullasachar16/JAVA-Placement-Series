package Patterns;

public class NumberPyramid {
    //Program to print Number Pyramid pattern
    public static void main(String[] args) {
        //print number pyramid triangle pattern
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
