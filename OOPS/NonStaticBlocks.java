package OOPS;

public class NonStaticBlocks {
    //program to implement non static blocks
    static int age;
    String name;
    static {
        age=22;
    }
    {
        System.out.println("1");
        age=20;
    }

    public static void main(String[] args) {
        System.out.println(age);
        NonStaticBlocks nsb=new NonStaticBlocks();
        System.out.println(nsb.name);
    }
    {
        System.out.println("2");
    }
    {
        System.out.println("3");
        name="tom";
    }
}
