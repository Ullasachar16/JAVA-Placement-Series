package Prep;

public class ArrayOperations {
    //Program to Implement Array Operations
    public static void main(String[] args) {
        double[] myList={1.9,2.9,3.4,3.5};
        double total=0;
        System.out.println("Array Elements are:");
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        for(int i=0;i<myList.length;i++){
           total+=myList[i];
        }
        System.out.println("Total:"+total);
        double max=myList[0];
        for(int i=0;i<myList.length;i++){
            if(myList[i]>max){
                max=myList[i];
            }
        }
        System.out.println("Max:"+max);
    }
}
