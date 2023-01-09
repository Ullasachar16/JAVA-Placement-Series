package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseASentence {
    //program to reverse a sentence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String str = sc.nextLine();
        String rev = "";

        String words[] = str.split(" ");

        //Adding the words stored in the array to the last
        System.out.println("Reverse Sentence:");
        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        }
}

