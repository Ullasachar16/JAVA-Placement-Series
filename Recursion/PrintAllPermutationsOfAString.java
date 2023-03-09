package Recursion;

public class PrintAllPermutationsOfAString {
    //Program to Print all Permutations of a string
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc" -> "ab"
            String newString=str.substring(0,i)+str.substring(i+1);
            printPerm(newString,permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPerm(str,"");

    }
}
