package Prep;

public class ArrayCopyExample {
    //Program to Copy array
    public static void main(String[] args) {
        char[] copyFrom={'d','e','c','c','a','n','c','h','a','r','g','e','r','s'};
        char[] copyTo=new char[15];
        System.arraycopy(copyFrom,0,copyTo,0,14);
        System.out.println(new String(copyTo));
    }
}
