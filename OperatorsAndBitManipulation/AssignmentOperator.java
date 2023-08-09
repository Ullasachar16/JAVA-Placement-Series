package OperatorsAndBitManipulation;

public class AssignmentOperator {
    //Program to Use the Assignment Operator
    public static void main(String[] args) {
        //Binary Operators
        //Addition
        int a=10,b=5;
        System.out.println(a+b);
        //Subtraction
        System.out.println(a-b);
        //Multiply
        System.out.println(a*b);
        //Divide
        System.out.println(a/b);
        //Mod
        System.out.println(a%b);

        //Unary Operators
        //Post Increment
        b=++a;
        System.out.println(a);
        System.out.println(b);

        //Pre Increment
        a=10;
        b=5;
        b=a++;
        System.out.println(a);
        System.out.println(b);

        //Pre Decrement
        a=10;
        b=5;
        b=a--;
        System.out.println(a);
        System.out.println(b);

        //post-decrement
        a=10;
        b=5;
        b=--a;
        System.out.println(a);
        System.out.println(b);
    }
}
