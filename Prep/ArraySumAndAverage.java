package Prep;

public class ArraySumAndAverage {
    //Program to Find the Sum and Average of Elements Inside Array
    public static void main(String[] args) {
        int a[]={1,4,7,9,13,15,17};
        int sum=0;
        for(int i=0;i< a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+(sum/a.length));
    }
}
