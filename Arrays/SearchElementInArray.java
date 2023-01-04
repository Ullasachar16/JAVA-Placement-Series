package Arrays;

import java.util.Scanner;

public class SearchElementInArray {
    //program to find or search an element given by the user in input array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int element[]=new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            element[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int x=sc.nextInt();
        for(int i=0;i< element.length;i++){
            if(element[i]==x){
                System.out.println("x found at:"+i);
            }
        }
    }
}
