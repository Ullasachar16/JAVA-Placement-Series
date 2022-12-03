package Patterns;

public class InvertedHalfPyramidUsingStars {
    public static void main(String[] args) {
        //print inverted half pyramid
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //another solution
        n=4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
