package StringBuilder;

import java.util.Scanner;

public class CumulativeLengthOfStrings {
    //Program to Print Cumulative Length of Strings using String Builder
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String Value: ");
        int size=sc.nextInt();
        StringBuilder array[]=new StringBuilder[size];
        int totLength=0;
        for(int i=0;i<size;i++){
            array[i]=sb.append(sc.next());
            totLength = array[i].length();
        }
        //Returning Total Input Character
        System.out.println("total length: "+totLength);
    }
}
