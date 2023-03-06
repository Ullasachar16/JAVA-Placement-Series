package Patterns;

public class PalindromicNumbersPyramid {
    //Program to print Palindromic Numbers Pyramid pattern
    public static void main(String[] args) {
        //Print pyramid triangle in palindromic numbers pattern
        int n=5;
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //first part numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //second part numbers
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
