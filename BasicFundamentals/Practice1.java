package BasicFundamentals;

public class Practice1 {
    //Another Practice Program of Patterns
    public static void main(String[] args) {
        int n=4;
        //Upper half
        for(int i=1;i<=n;i++) {
            //1st part
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        //lower half
        n=5;
        for(int i=n;i>=1;i--) {
            //1st part
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
