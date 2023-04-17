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
        Integer i=new Integer(a); //Converting Primitive to Non-Primitive Datatype
        System.out.println(b);
        //Auto Unboxing
        char ch=x; //Converting Non-Primitive to primitive datatype
        System.out.println(c);
    }
}
