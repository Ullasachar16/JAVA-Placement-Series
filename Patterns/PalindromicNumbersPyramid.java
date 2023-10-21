package Patterns;

public class PalindromicNumbersPyramid {
    //Program to Print Palindromic Numbers Pyramid Pattern
    public static void main(String[] args) {
        //Print Pyramid Triangle in Palindromic Numbers Pattern
        int n=5;
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //First Part numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //Second part numbers
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
