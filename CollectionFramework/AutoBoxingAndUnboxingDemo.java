package CollectionFramework;

public class AutoBoxingAndUnboxingDemo {
    //Program to Implement Auto Boxing and Auto Unboxing Demo Example
    public static void main(String[] args) {
        //Primitive Way of Representing 10
        int a=10;
        //Non-Primitive Way of Representing 10
        Integer b=20;
        //Primitive Way of Representing 'z'
        char c='z';
        //Non-Primitive Way of Representing 'z'
        Character x=new Character('z');
        //Auto Boxing
        Integer i=new Integer(a); //Converting primitive datatype to non primitive
        System.out.println(b);
        //Auto Unboxing
        char ch=x; //Converting non primitive to primitive datatype
        System.out.println(c);
    }
}
