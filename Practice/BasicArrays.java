package Practice;

public class BasicArrays {
    public static void main(String[] args) {
//        int[] myIntArray={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[0]);
        int[] myIntArray=new int[20];
        for(int i=0;i< myIntArray.length;i++){
            myIntArray[i]=i*10;
        }
        printArray(myIntArray);

    }
    public static void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println("Element " + i +" ,value is " +array[i]);
        }
    }
}
