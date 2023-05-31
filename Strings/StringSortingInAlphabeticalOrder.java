package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringSortingInAlphabeticalOrder {
    //Program to Sort String in Alphabetical Order
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //Create a Java String Array
        String[] names=null;
        System.out.println("How many names u want to sort:");
        int size=Integer.parseInt(br.readLine());

        names=new String[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+ " Name:");
            names[i]= br.readLine();
        }
        //Sort the Array using the Sort Method of the Arrays Class
        Arrays.sort(names);

        System.out.println("Sorted Names->");
        //Print the Sorted Results
        for(String name:names){
            System.out.println("\t"+name);
        }


    }
}
