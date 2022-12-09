package Practice;

public class ClassChallengeMain {
    public static void main(String[] args) {
        ClassChallengeBackground cbc=new ClassChallengeBackground("12345",0.00,"bob","myemail@bob.com",12345678);
        cbc.withdrawal(100.0);
        cbc.deposit(50.0);
        cbc.withdrawal(100.0);
        cbc.deposit(51.0);
        cbc.withdrawal(100.0);


    }
}
