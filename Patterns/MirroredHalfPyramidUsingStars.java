package Patterns;

public class MirroredHalfPyramidUsingStars {
    //Program to Print Mirrored Half Pyramid Pattern using Stars
    public static void main(String[] args) {
        /* Print Half Pyramid rotated by 180 degree like this
                    *
                  * *
                * * *
              * * * *
         */
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
