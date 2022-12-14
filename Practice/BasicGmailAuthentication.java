package Practice;

import java.util.Scanner;

public class BasicGmailAuthentication {
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
