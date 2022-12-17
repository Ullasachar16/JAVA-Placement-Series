package OOPS;

public class Amazon {
    void work(){
        System.out.println("Working at Amazon");
    }
}
interface Jspiders{
    void developApp();
}
interface Qspiders{
    void testApp();
}
class Employe extends Amazon implements Jspiders,Qspiders{
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
