package OOPS;

public class InstanceOf {
    public static void main(String[] args) {
        Father3 f=new Father3();
        Son3 s=new Son3();
        Daughter d=new Daughter();
        System.out.println(new Daughter()instanceof Daughter);
        System.out.println(s instanceof Son3);
        System.out.println(d instanceof Father3);
        System.out.println(f instanceof Father3);
        System.out.println(f instanceof Daughter);
        System.out.println(f instanceof Son3);
        System.out.println(d instanceof Daughter);
        System.out.println(new Son3()instanceof Father3);
        System.out.println(new Father3()instanceof Son3);
        System.out.println(new Father3()instanceof Daughter);
    }
}
class Father3{
    int x=10;
}
class Son3 extends Father3{
    int y=20;
}
class Daughter extends Father3{
    int z=30;
}
