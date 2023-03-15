package Threads;

public class ThreadSafeExample1 {
    //Another Example Program for Threads
    public static void main(String[] args) {
        Netflix netflix =new Netflix();
        Person p1=new Person("Tom", netflix);
        Person p2=new Person("Alex", netflix);
        p1.start();
        p2.start();
    }
}
class Netflix {
    synchronized void watchMovie(String name){
        System.out.println(name+" is watching some movie");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+" is done watching\n--------------");
    }
}
class Person extends Thread{
    String name;
    Netflix netflix;
    Person(String name, Netflix netflix){
        this.name=name;
        this.netflix = netflix;
    }
    @Override
    public void run(){
        netflix.watchMovie(name);
    }
}