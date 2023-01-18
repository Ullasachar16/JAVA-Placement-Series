package OOPS;

public class MethodOverloadingExample {
    //another example of method overloading
    //overloading main method
    public static void main(String[] args) throws Exception {
        System.out.println("start");
        main(10.5);
        main(100);
        System.out.println("end");
    }

    public static void main(int x) {
        System.out.println(x);
    }

    public static void main(double x) {
        System.out.println(x);

    }
}
