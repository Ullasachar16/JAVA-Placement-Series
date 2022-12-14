public class AnonymousInnerClassUsingAbstractClass1 {
    //anonymous inner class example 2
    public static void main(String[] args) {
        Car c=new Car(){
            @Override
            void start(){
                System.out.println("Car Started");
            }
        };
        c.start();
        new Car(){
            @Override
            void start(){
                System.out.println("Car Stopped");
            }
        }.start();
    }
}
abstract class Car{
    abstract void start();
}
