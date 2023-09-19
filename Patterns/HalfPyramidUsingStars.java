package Patterns;

public class HalfPyramidUsingStars {
    //Program to Print Half Pyramid pattern using stars
    public static void main(String[] args) {
        //Print Half Pyramid pattern
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
