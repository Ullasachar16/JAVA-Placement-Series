package Practice;

public class ClassChallengeMain {
    //Additional program for Constructor Chaining
    public static void main(String[] args) {
        ClassChallengeBackground cbc=new ClassChallengeBackground();
        //("12345",0.00,"bob","myemail@bob.com",12345678);
        System.out.println(cbc.getBalance());
        System.out.println(cbc.getAcNo());
        cbc.withdrawal(100.0);
        cbc.deposit(50.0);
        cbc.withdrawal(100.0);
        cbc.deposit(51.0);
        cbc.withdrawal(100.0);
        ClassChallengeBackground cbc1=new ClassChallengeBackground("tim","tim@email.com",12345);
        System.out.println(cbc.getAcNo()+" name "+cbc.getCustomerName());
    }
}
