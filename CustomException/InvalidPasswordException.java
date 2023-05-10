package CustomException;

import java.util.Scanner;

public class InvalidPasswordException extends RuntimeException{

}
class LoginForm{
    //Program to Implement Runtime Exception in Custom Exception(Invalid-password-exception)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user id:");
        String id= sc.next();
        System.out.println("Enter password:");
        int password= sc.nextInt();
        if(id.equals("admin")){
            if(password==123){
                System.out.println("Login Successful");
            }else {
                try {
                    InvalidPasswordException obj = new InvalidPasswordException();
                    throw obj;
                    //throw new InvalidPasswordException();
                }
                catch (InvalidPasswordException e){
                    System.out.println("Invalid Password Entered!!!");
                }
            }
        }
        sc.close();
    }
}