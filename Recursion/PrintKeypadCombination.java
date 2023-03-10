package Recursion;

public class PrintKeypadCombination {
    //Program to Print Keypad Combination
    public static String[] keypad={".","abc","def","ghi","jkl","mno",
            "pqrs","tu","vwx","yz"};

    public static void printComb(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(index);
        String mapping=keypad[currChar - '0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        printComb(str,0,"");
    }
}
