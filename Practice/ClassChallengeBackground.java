package Practice;

public class ClassChallengeBackground {
    //program to implement constructor chaining
    private String acNo;
    private double balance;
    private String customerName;
    private String email;
    private int phNo;

    public ClassChallengeBackground() {
        this("56789",2.50,"default name","default address",123);
        System.out.println("Empty Constructor called");
    }

    public ClassChallengeBackground(String acNo, double balance, String customerName, String email, int phNo) {
        System.out.println("Account constructor with parameters called");
        this.acNo = acNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phNo = phNo;
    }
    public ClassChallengeBackground(String customerName, String email, int phNo) {
        this("99999",100.55,customerName,email,phNo);
        this.customerName = customerName;
        this.email = email;
        this.phNo = phNo;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println(" Deposit of " +depositAmount+ " made.New balance is "+this.balance );
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<0){
            System.out.println("Only "+this.balance+" available.Withdrawal not processed");
        }else{
            this.balance-=withdrawalAmount;
            System.out.println("Withdrawal of  "+withdrawalAmount+ " processed. Remaining balance= "+this.balance);
        }
    }



    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    private String getEmail(){
        return this.email;
    }
    private void setPhN0(int phNo){
        this.phNo=phNo;
    }
    private int getPhNo(){
        return this.phNo;
    }
}
