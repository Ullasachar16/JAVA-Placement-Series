package Patterns;

public class FloydsTriangle {
    //Program to print Floyds Triangle
    public static void main(String[] args) {
        //Print floyd's triangle pattern
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
