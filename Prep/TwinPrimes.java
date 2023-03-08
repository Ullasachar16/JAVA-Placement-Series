package Prep;

public class TwinPrimes {
    //Program to print twin primes until N
    public static void main(String[] args) {
        String primeNo="";
        int j=0;
        int lastPrime=1;
        System.out.println("Twin Primes are:");
        for(int i=1;i<100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                primeNo+=i+" ";
                if((i-lastPrime)==2){
                    System.out.println("("+(i-2)+"."+i+")");
                }
                lastPrime=i;
            }
        }
        System.out.println("Prime Numbers are:"+primeNo);
    }
}
