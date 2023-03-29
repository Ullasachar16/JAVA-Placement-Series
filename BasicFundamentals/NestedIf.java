package BasicFundamentals;

public class NestedIf {
    //Program to Implement Nested-If
    public static void main(String[] args) {
        String name="John";
        String password="John404";
        if(name=="John"){
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
