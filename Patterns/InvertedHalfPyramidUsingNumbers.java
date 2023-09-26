package Patterns;

public class InvertedHalfPyramidUsingNumbers {
    //Another program for Printing Inverted Half Pyramid using Numbers
    public static void main(String[] args) {
         /* Print Inverted Half Pyramid Pattern using Numbers
                    1 2 3 4
                    1 2 3
                    1 2
                    1
         */
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        //Another Solution
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
