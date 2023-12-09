package Prep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountNoOfVowelsInAString {
    //Program to Count Number of Vowels in a String
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String:");
        String str=null;
        try {
            str = br.readLine();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        int noOfVowels=0;
        for(int i=0;i<str.length();i++){
            if((str.toLowerCase().charAt(i)=='a')||(str.toLowerCase().charAt(i)=='e')||(str.toLowerCase().charAt(i)=='i')||(str.toLowerCase().charAt(i)=='o')||(str.toLowerCase().charAt(i)=='u')){
                noOfVowels++;
            }
        }
        System.out.println("Number of vowels in "+str+" :"+noOfVowels);
    }
}
