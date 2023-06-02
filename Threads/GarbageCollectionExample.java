package Threads;

public class GarbageCollectionExample {
    //Example Program to Show Garbage Collection Implementation
    protected void finalize(){
        System.out.println("finalize method executing before garbage collecting");
    }
    public static void main(String[] args) {
        GarbageCollectionExample g=new GarbageCollectionExample();
        g=null;
        System.gc();
    }
}
