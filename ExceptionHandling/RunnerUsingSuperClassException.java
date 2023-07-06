package ExceptionHandling;

public class RunnerUsingSuperClassException {
    //Implementing Super Class Exception
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch (NullPointerException e){
            System.out.println("Invalid");
        }
        catch (ArithmeticException e){
            System.out.println("Invalid Denominator ");
        }
        catch (Exception e){
            System.out.println("Super Class Exception Handler");
        }
    }
}
