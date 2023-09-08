package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        //Program to Print Butterfly Pattern
        //Print Butterfly Pattern using stars
        int n=4;
        //upper part
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            System.out.println();
        }

    }
}
