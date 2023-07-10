package Practice;

import java.util.Scanner;

public class BasicGmailAuthentication {
    //Program to Implement Basic Gmail Authentication
    public static void main(String[] args) {
        String username="John";
        String password="johndoe";
        if(username=="John"){
            if(password=="johndoe"){
                System.out.println("Login Successful");
            }else {
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Username or Login Unsuccessful");
        }
    }
}
