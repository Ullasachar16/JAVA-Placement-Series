package Practice;

public class BasicsUnaryOperator {
    //Program to implement Unary Operator
    public static void main(String[] args) {
        //Post increment
        int x=1;
        int y=x++ + x++;
        System.out.println("x:"+x+" y:"+y);

        //Pre increment
        int a=1;
        int b=++a + ++a;
        System.out.println("a:"+a+" b:"+b);

        //Post decrement
        int p=1;
        int q=p-- + p--;
        System.out.println("p:"+p+" q:"+q);

        //Pre increment
        int i=1;
        int j=--i + --i;
        System.out.println("i:"+i+" j:"+j);
    }
}
