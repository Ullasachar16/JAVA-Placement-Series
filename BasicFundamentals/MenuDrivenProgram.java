package BasicFundamentals;

import java.util.Scanner;

public class MenuDrivenProgram {
    //Program to implement menu driven concept of student grade
    public static void main(String[] args) {
        // Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.
        //If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        //If they enter 0 then stop.
        //If he/ she scores :
        //Marks >=90 -> print “This is Good”
        //89 >= Marks >= 60 -> print “This is also Good”
        //59 >= Marks >= 0 -> print “This is Good as well”
        //	Because marks don’t matter but our effort does.
        //(Hint : use do-while loop but think & understand why)
        // ->>>>Using DoWhile Loop
       Scanner sc=new Scanner(System.in);
       int input;
        do{
            System.out.println("Enter Marks out of 100:");
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("Good");
            }else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            }else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Invalid marks");
            }
            System.out.println("Want to Continue???\nYes(1) or No(0)");
            input=sc.nextInt();
        }while(input==1);

       /* // ->>>>>Using While Loop
        System.out.println("enter 1 to enter marks or 0 to exit:");
        int n = sc.nextInt();
        int marks;
    while(n==1) {
        System.out.println("enter marks:");
        marks=sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Good");
        }else if(marks>=60 && marks<=89){
            System.out.println("This is also Good");
        }else if(marks>=0 && marks<=59){
            System.out.println("This is Good as well");
        }else{
            System.out.println("Invalid marks");
        }
        System.out.println("Enter 1 to continue or 0 to exit");
        n = sc.nextInt();
    }
      */
    }
}
