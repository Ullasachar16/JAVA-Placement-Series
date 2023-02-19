package Functions;
import java.util.Scanner;
public class AverageOfThreeNumbers {
    //Program to find average of 3 numbers
    public static int printAverage(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value 1:");
        int a= sc.nextInt();
        System.out.println("Enter value 2:");
        int b= sc.nextInt();
        System.out.println("Enter value 3:");
        int c= sc.nextInt();
        System.out.println("Average of 3 numbers is:"+printAverage(a,b,c));

    }
}
