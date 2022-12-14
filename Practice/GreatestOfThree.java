package Practice;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a=40,b=78,c=19;
        int res=c > (a>b ? a:b) ? c:((a>b) ? a:b);
        System.out.println("greatest is:"+res);
    }
}
