package ExceptionHandling;

public class RunnerUsingSuperClassException {
    //Implementing Super Class Exception
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch (NullPointerException e){
            System.out.println("invalid");
        }
        catch (ArithmeticException e){
            System.out.println("invalid denominator ");
        }
        catch (Exception e){
            System.out.println("super class exception handler");
        }
    }
}
