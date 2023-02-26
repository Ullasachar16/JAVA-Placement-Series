package OOPS;

public class PrimitiveCasting {
    //Program to get to know about primitive casting
    public static void main(String[] args) {
        //Widening
        int a=45;
        float f=a;
        System.out.println(f);

        float f1=4.55f;
        double d=f1;
        System.out.println(d);

        char x='a';
        int b=x;
        System.out.println(b);

        //Narrowing
        f1=4.55f;
        int a1=(int)f1;
        System.out.println(a1);

        double d1=3.15;
        int b1=(int)d1;
        System.out.println(b1);

        int x1=97;
        char y=(char)x1;
        System.out.println(y);
    }
}
