package BasicFundamentals;

public class NestedIf {
    //Program to Implement Nested-If
    public static void main(String[] args) {
        String name="John";
        String password="John404";
        if(name=="John"){
            if(password=="John404"){
                System.out.println("Login Successful");
            }else {
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Credentials");
        }
    }
}
