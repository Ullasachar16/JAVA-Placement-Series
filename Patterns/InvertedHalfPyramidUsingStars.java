package Patterns;

public class InvertedHalfPyramidUsingStars {
    //Program to print Inverted Half Pyramid using stars
    public static void main(String[] args) {
        //Print Inverted Half Pyramid
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Another solution
        n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
