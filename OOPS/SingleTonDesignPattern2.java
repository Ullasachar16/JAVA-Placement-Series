package OOPS;

public class SingleTonDesignPattern2 {
    //another example program for single ton design pattern
    public static void main(String[] args) {
        AadhaarCard ac=AadhaarCard.getInstance();
        System.out.println("Name:"+ac.name);
        System.out.println("AadhaarNo:"+ac.aadhaarNo);
    }
}
class AadhaarCard{
    String name="Tom";
    int aadhaarNo=123;
    private static AadhaarCard ac;
    private AadhaarCard(){
        System.out.println("Aadhaar Card Generated");
    }
    public static AadhaarCard getInstance(){
        if(ac==null){
            ac=new AadhaarCard();
        }
        return ac;
    }
}
