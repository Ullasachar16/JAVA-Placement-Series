package Threads;

public class ThreadSafeExample1 {
    //Another example program for threads
    public static void main(String[] args) {
        Netlfix netlfix=new Netlfix();
        Person p1=new Person("Tom",netlfix);
        Person p2=new Person("Alex",netlfix);
        p1.start();
        p2.start();
    }
}
class Netlfix{
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
    Netlfix netlfix;
    Person(String name,Netlfix netlfix){
        this.name=name;
        this.netlfix=netlfix;
    }
    @Override
    public void run(){
        netlfix.watchMovie(name);
    }
}