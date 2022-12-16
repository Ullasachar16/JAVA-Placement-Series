package OOPSPractice;

public class StaticBlocks {
    //static blocks
    static int age;
    static {
        System.out.println("1");
        age=10;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(age);
    }
    static {
        System.out.println("2");
        age=30;
    }
    static {
        System.out.println("3");
        age=20;
    }
}
