package OperatorsAndBitManipulation;

public class ToCheckANumberIsPowerOfTwo {
    //Program to check number is power of two or not
    static boolean isPowerOfTwo(int x) {
        if (x == 0)
            return false;
        while (x != 1) {
            if (x % 2 != 0)
                return false;
            x = x / 2;
        }
        return true;
    }
    // Driver method
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(32) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(63) ? "Yes" : "No");
    }
}
