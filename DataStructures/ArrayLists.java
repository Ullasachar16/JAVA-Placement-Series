package DataStructures;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    //ArrayList Example
    //Program to Implement the arraylist properties
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //Add Elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //To Get an Element
        int element = list.get(0); // 0 is the Index
        System.out.println(element);

        //Add Element in Between
        list.add(1,2); // 1 is the Index and 2 is the Element to be Added
        System.out.println(list);

        //Set Element
        list.set(0,0);
        System.out.println(list);

        //Delete Elements
        list.remove(0); // 0 is the Index
        System.out.println(list);

        //Size of List
        int size = list.size();
        System.out.println(size);

        //Loops on Lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Sorting the List
        list.add(0,0);
        Collections.sort(list);
        System.out.println(list);
    }

}
