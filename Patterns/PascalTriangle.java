package Patterns;

public class PascalTriangle {
    //Program to Print Pascal Triangle Pattern
    public static void main(String[] args) {
        //Print Pascal triangle number pattern
            int n=5,space, num;
            for(int i=0; i<n; i++)
            {
                for(space=n; space>i; space--)
                {
                    System.out.print(" ");
                }
                num=1;
                for(int j=0; j<=i; j++)
                {
                    System.out.print(num+ " ");
                    num = num*(i-j)/(j+1);
                }
                System.out.print("\n");
            }
        }
}