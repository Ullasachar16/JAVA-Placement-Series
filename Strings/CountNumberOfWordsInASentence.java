package Strings;

import java.util.Scanner;

public class CountNumberOfWordsInASentence {
    //Program to Count Numbers of Words in a Sentence Inputted by the User
    public static int countWords(String sentence){
        String words[]=sentence.split("");
        int count = words.length;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String sentence=sc.nextLine();
        System.out.println("Your Sentence has "+countWords(sentence)+ " Words");
        sc.close();
    }
}
