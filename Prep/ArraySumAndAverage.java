package Prep;

public class ArraySumAndAverage {
    //Program to find the Sum and Average of elements inside array
    public static void main(String[] args) {
        int a[]={1,4,7,9,13,15,17};
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum+=a[i];
        }
        System.out.println("sum:"+sum);
        System.out.println("average:"+(sum/a.length));
    }
}
