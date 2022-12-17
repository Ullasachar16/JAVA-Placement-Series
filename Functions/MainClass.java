package Functions;
import OOPS.Car4;
public class MainClass {
    public static void main(String[] args) {
        //accessing public class in diff package
        Car4 c=new Car4();
        System.out.println("cost:"+c.cost);
    }
}
