package Libraries;

public class PalindromeString {
    //program to check for string palindrome
    public static void main(String[] args) {
        String s="madan";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s1.equals(s)){
            System.out.println(s+" is palindrome");
        }else{
            System.out.println(s+" is not a palindrome");
        }
    }
}
