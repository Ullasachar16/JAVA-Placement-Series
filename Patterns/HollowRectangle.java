package Patterns;
public class HollowRectangle {
    //Program to Print Hollow Rectangle Pattern
    public static void main(String[] args) {
        //Print Hollow Rectangle Pattern
        int n=4;
        int m=5;
        //Outer Loop
        for(int i=1;i<=n;i++){
            //Inner loop
            for(int j=1;j<=m;j++) {
                if (i == 1 || j == 1 || i==n || j==m) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
