package BasicFundamentals;

public class NestedIf {
    //Program to Implement Nested-If
    public static void main(String[] args) {
        String name="john";
        String password="john404";
        if(name=="john"){
            if(password=="john404"){
                System.out.println("login successful");
            }else {
                System.out.println("invalid password");
            }
        }else{
            System.out.println("invalid credentials");
        }
    }
}
