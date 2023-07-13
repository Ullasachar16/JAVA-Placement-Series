package Practice;

public class BasicsUnaryOperator {
    //Program to Implement Unary Operator
    public static void main(String[] args) {
        //Post Increment
        int x=1;
        int y=x++ + x++;
        System.out.println("X:"+x+" Y:"+y);

        //Pre Increment
        int a=1;
        int b=++a + ++a;
        System.out.println("A:"+a+" B:"+b);

        //Post Decrement
        int p=1;
        int q=p-- + p--;
        System.out.println("P:"+p+" Q:"+q);

        //Pre Decrement
        int i=1;
        int j=--i + --i;
        System.out.println("I:"+i+" J:"+j);
    }
}
