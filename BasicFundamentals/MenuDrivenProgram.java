package BasicFundamentals;

import java.util.Scanner;

public class MenuDrivenProgram {
    //Program to Implement Menu Driven Concept of Student Grade
    public static void main(String[] args) {
        // Make a menu-driven program. The User can Enter 2 numbers, Either 1 or 0.
        //If the User Enters 1 then Keep taking input from the User for a Student’s Marks(out of 100).
        //If they Enter 0 then Stop.
        //If He/ She Scores :
        //Marks >=90 -> print “This is Good”
        //89 >= Marks >= 60 -> print “This is also Good”
        //59 >= Marks >= 0 -> print “This is Good as well”
        //	Because Marks Don’t Matter but our Effort Does.
        //(Hint : Use Do-while loop but think & understand why)
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
        System.out.println("Enter 1 to Enter Marks or 0 to Exit:");
        int n = sc.nextInt();
        int marks;
    while(n==1) {
        System.out.println("Enter marks:");
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
