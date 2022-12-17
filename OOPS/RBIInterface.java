package OOPS;

public interface RBIInterface {
    void deposit();
}
interface HDFC extends RBIInterface{
    void withdraw();
}
class AccountHolder implements HDFC{
    @Override
    public void deposit(){
        System.out.println("Amount Deposited");
    }
    @Override
    public void withdraw(){
        System.out.println("Amount Withdrawn");
    }
    public static void main(String[] args) {
        AccountHolder ah=new AccountHolder();
        ah.deposit();
        ah.withdraw();
    }
}
