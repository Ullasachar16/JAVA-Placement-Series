package Functions;

import java.util.Scanner;

public class PrintMyName {
    //Program to print the string(name) entered by the user
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        printMyName("name:"+name);
    }
}
