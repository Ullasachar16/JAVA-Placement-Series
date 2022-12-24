package MultiThreading;

public class ThreadClassExample1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=60;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
class Runner{
    public static void main(String[] args) {
        ThreadClassExample1 t=new ThreadClassExample1();
        t.setName("Even no from 1 to 100");
        System.out.println("Thread name is:\n"+t.getName());
        t.start();
        Thread t1=new Thread();
        t1.setName("dinga");
        System.out.println(t1.getName());
        Thread t2=new Thread();
        t2.setName("guldu");
        System.out.println(t2.getName());
    }
}
