package Recursion;

public class CheckIfAnArrayIsSorted {

    //Program to Check if an Array is Sorted(Strictly Increasing)
    public static boolean isSorted(int arr[],int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            //Array is Unsorted
            return false;
        }else {
            return isSorted(arr,index+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,3};
        System.out.println(isSorted(arr,0));

    }
}
