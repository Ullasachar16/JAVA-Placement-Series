package Threads;

public class RunnableInterfaceExample1 implements Runnable{
    //Program to Implement Runnable Interface Another Example
    @Override
    public void run(){
        for(int i=1;i<=30;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
class Test implements Runnable{
    @Override
    public void run(){
        System.out.println("Test is Being Conducted");
    }
}
class Runnerr{
    public static void main(String[] args) {
        RunnableInterfaceExample1 r=new RunnableInterfaceExample1();
        Thread t1=new Thread(r,"Odd Numbers till 30");
        System.out.println(t1.getName());
        t1.setPriority(10);
        t1.start();
        Test t=new Test();
        Thread t2=new Thread(t,"Test");
        System.out.println(t2.getName());
        t2.setPriority(1);
        t2.start();
    }
}