package CollectionFramework;

public class ForEachLoopExample {
    //Program to Show how For Each Loop works
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------");
        for(int i:a){
            System.out.println(i);
        }
        System.out.println("----------");
        double[] percentage={1.2,3.5,5.6};
        for(double d:percentage){
            System.out.println(d);
        }
    }
}
