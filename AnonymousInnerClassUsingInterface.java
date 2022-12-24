public class AnonymousInnerClassUsingInterface {
    public static void main(String[] args) {
        Flipkart f=new Flipkart() {
            @Override
            public void purchase() {
                System.out.println("Purchasing Mobile");
            }
        };
        f.purchase();
        new Flipkart(){
            @Override
            public void purchase(){
                System.out.println("Purchasing Laptop");
            }
        }.purchase();
    }
}
interface Flipkart{
    abstract void purchase();
}
