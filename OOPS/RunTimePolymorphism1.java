package OOPS;

public class RunTimePolymorphism1 {
    static void selectApp(FoodDeliveryApp app){
        app.order();
    }
    public static void main(String[] args) {
        selectApp(new Swiggy());
        selectApp(new Zomato());
        System.out.println("__________________");
        FoodDeliveryApp app=new Swiggy();
        app.order();
        System.out.println("------------------");
        FoodDeliveryApp app1=new Zomato();
        app1.order();
        System.out.println("+++++++++++++++++++");
        FoodDeliveryApp app2;
        app2=new Swiggy();
        app2.order();
        System.out.println("==================");
        app2=new Zomato();
        app2.order();
    }
}
class FoodDeliveryApp{
    void order(){
        System.out.println("Oredering Food");
    }
}class Swiggy extends FoodDeliveryApp{
    @Override
    void order(){
        System.out.println("Ordered Biryani");
    }
}class Zomato extends FoodDeliveryApp{
    @Override
    void order(){
        System.out.println("Ordered Curd Rice");
    }
}