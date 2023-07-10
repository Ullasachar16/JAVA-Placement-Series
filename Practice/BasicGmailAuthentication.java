package Practice;

import java.util.Scanner;

public class BasicGmailAuthentication {
    //Program to Implement Basic Gmail Authentication
    public static void main(String[] args) {
        String username="John";
        String password="johndoe";
        if(username=="john"){
            if(password=="johndoe"){
                System.out.println("Login successful");
            }else {
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid Username or Login unsuccessful");
        }
    }
}
