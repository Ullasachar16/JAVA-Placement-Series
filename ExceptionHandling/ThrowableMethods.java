package ExceptionHandling;

public class ThrowableMethods {
    //Implementing Throwable Methods
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());  //-> / by zero
            //e.printStackTrace(); //-> java.lang.ArithmeticException: / by zero at ExceptionHandling.ThrowableMethods.main(ThrowableMethods.java:7)
        }
        System.out.println("End");
    }
}
