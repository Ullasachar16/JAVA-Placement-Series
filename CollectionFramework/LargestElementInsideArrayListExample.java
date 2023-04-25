package CollectionFramework;

import java.util.ArrayList;

public class LargestElementInsideArrayListExample {
    //Program to Get Largest Element Inside ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(54);
        a.add(5);
        a.add(25);
        System.out.println(a);
        int max=a.get(0);
        for(int i=1;i<a.size();i++){
            if(a.get(i)>max){
                max=a.get(i);
            }
        }
        System.out.println("max:"+max);
        int large=a.get(0);
        for(int i:a){
            if(i>large){
                large=i;
            }
        }
        System.out.println("large:"+large);
    }
}
