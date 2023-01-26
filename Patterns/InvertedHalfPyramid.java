package Patterns;

public class InvertedHalfPyramid {
    //program to print inverted half pyramid using numbers
    public static void main(String[] args) {
//        Print Inverted Half Pyramid.
//        11111
//        222
//        33
//        4

        int n=4;
        int number=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
            }
            number++;
            System.out.println();
        }
    }
}

