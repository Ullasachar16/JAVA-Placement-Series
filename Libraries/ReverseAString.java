package Libraries;

public class ReverseAString {
    //Program to Reverse a string
    public static void main(String[] args) {
        String s="J A V A";
        char[] c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
}
