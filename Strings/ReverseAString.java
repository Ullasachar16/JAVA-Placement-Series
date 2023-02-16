package Strings;

public class ReverseAString {
    //Program to reverse a string using for loop
    public static void main(String[] args) {
        String s="Aman";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
