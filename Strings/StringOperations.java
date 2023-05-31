package Strings;

public class StringOperations {
    public static void main(String[] args) {
        //Program to Execute String Operations
        //Concatenation
        String firstName="Tony";
        String lastName="Stark";
        String fullName=firstName+"@"+lastName;
        System.out.println(fullName);
        //Tony@Stark
        //Length
        System.out.println("Length:"+fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
        //Compare
        String name1="Tony";
        String name2="tony";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }else {
            System.out.println("Strings are Not equal");
        }
    }
}
