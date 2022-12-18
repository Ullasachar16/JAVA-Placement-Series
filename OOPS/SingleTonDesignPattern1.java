package OOPS;

public class SingleTonDesignPattern1 {
    public static void main(String[] args) {
        PrimeMinister pm = PrimeMinister.getInstance();
        System.out.println("Name:"+pm.name);
    }
}
class PrimeMinister{
    String name="Modi";
    private static PrimeMinister pm;
    private PrimeMinister(){
        System.out.println("PM elected");
    }
    public static PrimeMinister getInstance() {
        if (pm == null) {
            pm = new PrimeMinister();
        }
        return pm;
    }
}
