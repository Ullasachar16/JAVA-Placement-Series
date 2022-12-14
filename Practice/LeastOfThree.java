package Practice;

public class LeastOfThree {
    public static void least(int a,int b,int c){
        int least=(a<b)?(a<c? a:c):(b<c?b:c);
        System.out.println("Least among "+a+ " ,"+b+" and "+c+ " is:"+least);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=110;
        least(a,b,c);
    }
}
