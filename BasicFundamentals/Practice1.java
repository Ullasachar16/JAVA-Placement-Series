package BasicFundamentals;

public class Practice1 {
    //Another Practice Program of Patterns
    public static void main(String[] args) {
        int n=4;
        //Upper Half
        for(int i=1;i<=n;i++) {
            //1st Part
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        //Lower Half
        n=5;
        for(int i=n;i>=1;i--) {
            //1st Part
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
