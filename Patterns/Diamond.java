package Patterns;

public class Diamond {
    public static void main(String[] args) {
        //Program to Print Pattern of Diamond
        //Print Diamond Pattern using Stars
        int n=4;
        //Upper Half
        for(int i=1;i<=n;i++){ //Outer Loop
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //Stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n;i>=1;i--){ //outer loop
            //Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
