package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringSortingInAlphabeticalOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        //create a java string array
        String[] names=null;
        System.out.println("how many names u want to sort:");
        int size=Integer.parseInt(br.readLine());

        names=new String[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+ " name:");
            names[i]= br.readLine();
        }
        //sort the array using the sort method of the arrays class
        Arrays.sort(names);

        System.out.println("Sorted names->");
        //print the sorted results
        for(String name:names){
            System.out.println("\t"+name);
        }


    }
}
