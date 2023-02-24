package OOPS;

public class Employ {
    //Example program for inheritance
    String Company="Amazon";
}
class Tester1 extends Employ{
    void testApp(){
        System.out.println("Testing app");
    }
}
class Developer2 extends Employ{
    void developApp(){
        System.out.println("Developing app");
    }
}
class Solution2{
        Employ e=new Developer2(); //or new Tester1();
        static void work(Employ e) {
            if (e instanceof Developer2) {
                Developer2 d = (Developer2) e;
                System.out.println("Company name:" + d.Company);
                d.developApp();
            } else if (e instanceof Tester1) {
                Tester1 t = (Tester1) e;
                System.out.println("Company name:" + t.Company);
                t.testApp();
            }
        }
    public static void main(String[] args) {
            work(new Developer2());
            work(new Tester1());
    }
    }
