package OOPS;

public class SumAndAverageOfNElements {
    //program for finding sum and avg of n elements
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
