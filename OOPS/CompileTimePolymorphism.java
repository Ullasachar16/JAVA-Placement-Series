package OOPS;

public class CompileTimePolymorphism {
    //Program to show compile time polymorphism example
    public static void main(String[] args) {
        Flipkart f=new Flipkart();
        f.purchase("mobile",40000);
        f.purchase(35000,"water purifier");
        f.purchase(3000);
        f.purchase("Smartwatch");
    }
}
class Flipkart{
    void purchase(int cost){
        System.out.println("cost:"+cost);
    }
    void purchase(String product){
        System.out.println("product:"+product);
    }
    void purchase(String product,int cost){
        System.out.println("product:"+product+" cost:"+cost);
    }
    void purchase(int cost,String product){
        System.out.println("cost:"+cost+" product:"+product);
    }
}
