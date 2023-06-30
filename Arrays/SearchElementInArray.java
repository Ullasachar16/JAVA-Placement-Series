package Arrays;

import java.util.Scanner;

public class SearchElementInArray {
    //Program to Find or Search an Element inputted by the User in the Form of Array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size=sc.nextInt();
        int element[]=new int[size];
        System.out.println("Enter Array Element:");
        for(int i=0;i<size;i++){
            element[i]=sc.nextInt();
        }
        System.out.println("Enter Element to be Searched:");
        int x=sc.nextInt();
        for(int i=0;i< element.length;i++){
            if(element[i]==x){
                System.out.println("X found at:"+i);
            }
        }
    }
}
