package ExceptionHandling;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ClassCastException e){
            System.out.println("invalid ");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
