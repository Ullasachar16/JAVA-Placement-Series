package ExceptionHandling;

public class FinallyBlockExample {
    //Implementing Finally Block Example
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ClassCastException e){
            System.out.println("Invalid ");
        }
        finally {
            System.out.println("Inside Finally block");
        }
    }
}
