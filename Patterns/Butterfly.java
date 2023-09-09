package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        //Program to Print Butterfly Pattern
        //Print Butterfly Pattern using Stars
        int n=4;
        //Upper Part
        for(int i=1;i<=n;i++){
            //1st Part
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //Spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //Spaces
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            System.out.println();
        }
        //Lower Half
        for(int i=n;i>=1;i--){
            //1st Part
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
