package Threads;

public class GarbageCollectionExample {
    //Example Program to Show Garbage Collection Implementation
    protected void finalize(){
        System.out.println("Finalize Method Executing before Garbage Collecting");
    }
    public static void main(String[] args) {
        GarbageCollectionExample g=new GarbageCollectionExample();
        g=null;
        System.gc();
    }
}
