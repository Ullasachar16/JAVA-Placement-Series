package Threads;

public class RunnableInterfaceExample implements Runnable{
    //Program to Implement Runnable Interface example
    @Override
    public void run(){
        System.out.println("Purchasing Laptop");
    }
}
class Flipkart implements Runnable{
    @Override
    public void run(){
        System.out.println("Purchasing Mobile");
    }
}
class Solution1{
    public static void main(String[] args) {
        RunnableInterfaceExample r=new RunnableInterfaceExample();
        Thread t1=new Thread(r,"Amazon Thread");
        System.out.println(t1.getName());
        t1.start();
        Flipkart f=new Flipkart();
        Thread t2=new Thread(f,"Flipkart Thread");
        System.out.println(t2.getName());
        t2.start();
    }
}