package Patterns;

public class SolidRhombus {
    //Program to Print Solid Rhombus Pattern
    public static void main(String[] args) {
        //Print Solid Rhombus Containing stars
        int n=5;
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
