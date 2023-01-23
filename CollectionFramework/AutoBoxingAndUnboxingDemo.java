package CollectionFramework;

public class AutoBoxingAndUnboxingDemo {
    //program to implement auto boxing and auto unboxing demo example
    public static void main(String[] args) {
        //primitive way of representing 10
        int a=10;
        //non-primitive way of representing 10
        Integer b=20;
        //primitive way of representing 'z'
        char c='z';
        //non-primitive way of representing 'z'
        Character x=new Character('z');
        //auto boxing
        Integer i=new Integer(a); //converting primitive datatype to non primitive
        System.out.println(b);
        //auto unboxing
        char ch=x; //converting non primitive to primitive datatype
        System.out.println(c);
    }
}
