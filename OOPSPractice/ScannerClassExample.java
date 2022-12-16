package OOPSPractice;

import java.util.Scanner;

public class ScannerClassExample {
    void checkPosOrNeg(int x) {
        if (x > 0) {
            System.out.println("positive");
        }else if(x==0){
            System.out.println("zero");
        }
        else {
            System.out.println("negative");
        }
    }

}
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ScannerClassExample sce=new ScannerClassExample();
        for(int i=0;i<2;i++){
            System.out.println("enter number");
            int a=sc.nextInt();
            sce.checkPosOrNeg(a);
        }
    }
}
