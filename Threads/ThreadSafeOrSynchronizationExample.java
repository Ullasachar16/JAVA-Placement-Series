package Threads;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadSafeOrSynchronizationExample {
    //Program to Implement Thread Safe or Synchronization
    public static void main(String[] args) {
        Trainer trainer=new Trainer();
        Student s1=new Student("Tom",trainer);
        Student s2=new Student("Jack",trainer);
        Student s3=new Student("Alex",trainer);
        s1.start();
        s2.start();
        s3.start();
    }
}
class Trainer{
    synchronized void askQuestions(String name){
        System.out.println(name+" is asking a Question?");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name+ " has got the answer\n------");
    }
}
class Student extends Thread{
    String name;
    Trainer trainer;
    Student(String name,Trainer trainer){
        this.name=name;
        this.trainer=trainer;
    }
    @Override
    public void run(){
        trainer.askQuestions(name);
    }
}
