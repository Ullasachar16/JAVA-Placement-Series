package Functions;
import OOPS.Car4;
public class MainClass extends Car4 {
    //program to access class across diff package example
    public static void main(String[] args) {
        //accessing public and protected in diff package
        Car4 c=new Car4();
        MainClass mc=new MainClass();
        System.out.println("car cost:"+c.cost);
        System.out.println("car name:"+mc.name);
    }
}
