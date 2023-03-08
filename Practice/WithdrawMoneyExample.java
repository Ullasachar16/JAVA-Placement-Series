package Practice;

public class WithdrawMoneyExample {
    //Program to implement Banking Operation Example
    public static void main(String[] args) {
        double act_bal=11999;
        double withdraw=2000;
        while(act_bal>=2000){
            System.out.println("Withdraw amount:"+withdraw);
            act_bal=act_bal-withdraw;
            System.out.println("account balance:"+act_bal);
        }

    }
}
