package OOPSPractice;

public class ArraysExamples {
    public static void main(String[] args) {
        //even numbers in an array
        int[] a={10,25,13,44,51,65,7,8,9,10,11,13,15,16,18,20,21};
                for(int i=0;i< a.length;i++){
                    if(a[i]%2==0){
                        System.out.print(a[i]+" ");
                    }
                }
                int min=a[0];
                for(int i=0;i< a.length;i++){
                    if(a[i]<min){
                        min=a[i];
                    }
                }
        System.out.println();
        System.out.println(min);
    }
}
