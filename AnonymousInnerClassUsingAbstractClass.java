public class AnonymousInnerClassUsingAbstractClass {
    //Program to Show How Anonymous Inner Class using Abstraction is Done
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
