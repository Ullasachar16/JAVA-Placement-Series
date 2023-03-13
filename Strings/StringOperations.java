package Strings;

public class StringOperations {
    public static void main(String[] args) {
        //Program to Execute string operations
        //Concatenation
        String firstName="tony";
        String lastName="stark";
        String fullName=firstName+"@"+lastName;
        System.out.println(fullName);
        //tony@stark
        //Length
        System.out.println("length:"+fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
        //compare
        String name1="tony";
        String name2="tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
