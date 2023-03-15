package Threads;

public class ThreadClassExample extends Thread {
    //Program to show Thread class example
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i:" + i);
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
class Student2 extends Thread{
    @Override
    public void run(){
        for(int j=6;j<=10;j++){
            System.out.println("j:"+j);
            try{
                Thread.sleep(1500);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Solution{
    public static void main(String[] args) {
        Student2 s=new Student2();
        //s.setName("2nd Thread");
        System.out.println(s.getName());
        System.out.println(s.getPriority());
        s.start();
        ThreadClassExample tce=new ThreadClassExample();
        tce.setName("1st thread");
        tce.setPriority(4);
        System.out.println(tce.getName());
        tce.start();

    }
}
