package Patterns;

public class HollowRhombus {
    //Program to Print Hollow Rhombus pattern
    public static void main(String[] args) {
//        Print a hollow Rhombus.
//                ******
//               *     *
//              *     *
//             *     *
//             ******

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
