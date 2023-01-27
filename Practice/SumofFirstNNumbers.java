package Practice;

public class SumofFirstNNumbers {
    //program to find sum o first n numbers
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of "+n+ " numbers is: "+sum);
    }
}
