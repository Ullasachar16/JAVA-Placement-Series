package Patterns;

public class MirroredHalfPyramidUsingStars {
    //Program to print Mirrored Half Pyramid pattern using stars
    public static void main(String[] args) {
        /* print half pyramid rotated by 180 degree like this
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
