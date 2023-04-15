package CollectionFramework;

public class AutoBoxingAndUnboxingDemo {
    //Program to Implement Auto Boxing and Auto Unboxing Demo Example
    public static void main(String[] args) {
        //Primitive Way of Representing 10
        int a=10;
        //Non-primitive way of representing 10
        Integer b=20;
        //Primitive way of representing 'z'
        char c='z';
        //Non-primitive way of representing 'z'
        Character x=new Character('z');
        //Auto boxing
        Integer i=new Integer(a); //converting primitive datatype to non primitive
        System.out.println(b);
        //Auto unboxing
        char ch=x; //converting non primitive to primitive datatype
        System.out.println(c);
    }
}
