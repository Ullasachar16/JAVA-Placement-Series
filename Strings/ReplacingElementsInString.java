package Strings;

import java.util.Scanner;

public class ReplacingElementsInString {
    //Program to Replace Specific Elements in a String Inputted by the user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        String result="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result=result+'@';
            }else{
                result=result+str.charAt(i);
            }
        }
        System.out.println("result string:"+result);
    }
}
