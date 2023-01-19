package OOPS;

public class SingleTonDesignPattern {
    //program to implement single ton design pattern
    public static void main(String[] args) {
        Account.createObject();
        Account.createObject();
        Account.createObject();
    }
}
class Account{
    private static Account obj;
    private Account(){
        System.out.println("Object Created");
    }
    public static void createObject(){
        if(obj==null){
            obj=new Account();
        }else{
            System.out.println("Cannot create object");
        }
    }
}
