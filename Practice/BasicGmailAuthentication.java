package Practice;

import java.util.Scanner;

public class BasicGmailAuthentication {
    //program to implement basic gmail authentication
    public static void main(String[] args) {
        String username="john";
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
