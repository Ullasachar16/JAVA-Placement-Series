package Functions;

import java.util.Scanner;

public class CountOfPosNegZerosEntered {
    //program to count positive negative and zeroes entered
    public static void printCount(int input){
        int positive=0,negative=0,zeros=0;
        Scanner sc = new Scanner(System.in);
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);

    }
    public static void main(String args[]) {
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printCount(input);
    }

}
