package OOPS;

public class SumAndAverageOfNElements {
    //Program for finding sum and average of n elements
    public static void main(String[] args) {
        int sum=0;
        int[] a={10,20,30,40};
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(sum/ a.length);
    }
}
