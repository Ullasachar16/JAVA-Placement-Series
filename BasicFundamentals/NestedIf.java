package BasicFundamentals;

import java.util.Scanner;

public class NestedIf {
    //Program to Implement Nested-If
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter password:");
        String password=sc.nextLine();
        if(name=="John"){
            if(password=="John404"){
                System.out.println("Login Successful");
            }else {
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Credentials");
        }
    }
}
