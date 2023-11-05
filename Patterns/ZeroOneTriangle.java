package Patterns;

public class ZeroOneTriangle {
    //Program to Print Zero-One Triangle Pattern
    public static void main(String[] args) {
        //Print 0-1 Triangle
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
