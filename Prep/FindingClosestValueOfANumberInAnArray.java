package Prep;

import java.util.Scanner;

public class FindingClosestValueOfANumberInAnArray {
    //Program to Find the Closest Value of a Number in an Array
    public static void main(String[] args) {
        int a[];
        int find;
        int closest=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array:");
        int size=sc.nextInt();
        a=new int[size];
        System.out.println("Enter Numbers for Array:");
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Numbers are:");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Enter Number to find closest value:");
        find=sc.nextInt();
        int dist=Math.abs(closest-find);
        for(int i:a){
            int dist1=Math.abs(i-find);
            if(dist>dist1){
                closest=i;
                dist=dist1;
            }
        }
        System.out.println("Closest Value is:"+closest);
    }
}
