package Prep;

import java.util.Scanner;

public class CountNoOfWordsInASentence {
    public static int countWords(String str){
        String words[]=str.split("");
        int count=words.length;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        System.out.println("Your Sentence has "+countWords(str)+" words");
        sc.close();
    }
}
