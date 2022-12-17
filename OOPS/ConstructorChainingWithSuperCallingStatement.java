package OOPS;

public class ConstructorChainingWithSuperCallingStatement {
}
//explicit super calling statement
class Father2{
    Father2(String name){
        System.out.println(name);
    }
}
class Son2 extends Father2{
    Son2(){
        super("tom");
        System.out.println("Son also has a name");
    }

    public static void main(String[] args) {
        Son2 s=new Son2();
    }
}