package Strings;

import java.util.Scanner;

public class CountNumberOfWordsInASentence {
    //Program to Count Numbers of Words in a Sentence inputted by the user
    public static int countWords(String sentence){
        String words[]=sentence.split("");
        int count = words.length;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence=sc.nextLine();
        System.out.println("Your sentence has "+countWords(sentence)+ " words");
        sc.close();
    }
}
