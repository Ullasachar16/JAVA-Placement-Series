public class AnonymousInnerClassUsingAbstractClass {
    //program to show how anonymous inner class using abstraction is done
    public static void main(String[] args) {
        Employ e=new Employ() {
            @Override
            void work() {
                System.out.println("Working");
            }
        };
        e.work();
    }
}
abstract class Employ{
    abstract void work();
}