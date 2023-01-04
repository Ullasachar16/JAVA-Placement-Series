package ExceptionHandling;

public class ThrowsKeywordExampleInUncheckException {
    //Implementing Throws Keyword In Uncheck Exception
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
