package ExceptionHandling;

public class ThrowsKeywordExampleInUncheckException {
    static void div()throws ArithmeticException{
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        System.out.println("Start");
        try{
            div();
        }
        catch (ArithmeticException e){
            System.out.println("Handled");
        }

        System.out.println("End");
    }
}
