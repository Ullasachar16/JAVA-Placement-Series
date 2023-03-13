package Strings;

import java.util.Scanner;

public class DisplayUsername {
    //Program to Print Username inputted by the user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String email=sc.next();
        String userName="";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                userName=userName+email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
