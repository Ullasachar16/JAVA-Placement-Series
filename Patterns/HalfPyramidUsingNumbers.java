package Patterns;

public class HalfPyramidUsingNumbers {
    //Program to print Half Pyramid pattern using numbers
    public static void main(String[] args) {
        /* Print half pyramid pattern using numbers
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
