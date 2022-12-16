package OOPS;

public class MethodOveriding2 {
    public static void main(String[] args) {
        Whatsapp3 wa=new Whatsapp3();
        wa.sendMessage();
        System.out.println("_____________");
        wa.story();
        System.out.println("-------------");
        wa.payment();
    }
}
class Whatsapp1{
    void sendMessage(){
        System.out.println("Single tick supported");
    }
}
class Whatsapp2 extends Whatsapp1{
    @Override
    void sendMessage(){
        super.sendMessage();
        System.out.println("double tick supported");
    }
    void story(){
        System.out.println("Images are supported");
    }
}class Whatsapp3 extends Whatsapp2{
    @Override
    void sendMessage(){
        super.sendMessage();
        System.out.println("blue tick supported");
    }
    @Override
    void story(){
        super.story();
        System.out.println("Videos are supported");
    }
    void payment(){
        System.out.println("can pay using whatsapp");
    }
}