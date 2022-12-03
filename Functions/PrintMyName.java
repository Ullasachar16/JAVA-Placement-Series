package Functions;

import java.util.Scanner;

public class PrintMyName {
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
