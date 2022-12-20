package ExceptionHandling;

public class TestArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int a[]={10,20,30};
        try {
            System.out.println(a[20]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
    }
}
