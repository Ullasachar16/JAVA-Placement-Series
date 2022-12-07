package OperatorsAndBinaryNumberSystem;

public class BitwiseOperator {
    public static void main(String[] args) {
        //binary AND
        int a=5,b=4;
        System.out.println(a&b);

        //binary OR
        System.out.println(a|b);

        //binary XOR
        System.out.println(a^b);

        //binary 1's Complement
        System.out.println(~a);

        //binary left shift
        a=0110;
        b=0101;
        System.out.println(a<<b);

        //binary right shift
        System.out.println(a>>b);

    }
}
