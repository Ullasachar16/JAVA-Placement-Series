package Collections;

public class ReverseAStringWithoutUsingToCharArray {
    public static void main(String[] args) {
        String x="A B C D";
        for(int i=x.length()-1;i>=0;i--){
            System.out.print(x.charAt(i));
        }
    }
}
