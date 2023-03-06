package Patterns;

public class ZeroOneTriangle {
    //Program to print Zero-One Triangle pattern
    public static void main(String[] args) {
        //print 0-1 triangle
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
