package OOPS;

public class Amazon {
    //program to implement interface operation
    void work(){
        System.out.println("Working at Amazon");
    }
}
interface Jspiders{
    //extending interface
    void developApp();
}
interface Qspiders{
    //extending interface
    void testApp();
}
class Employe extends Amazon implements Jspiders,Qspiders{
    //class extending class and implementing interfaces
    @Override
    public void developApp(){
        System.out.println("Developing App");
    }
    @Override
    public void testApp(){
        System.out.println("Testing App");
    }
    public static void main(String[] args) {
        Employe e=new Employe();
        e.work();
        e.developApp();
        e.testApp();
    }
}
