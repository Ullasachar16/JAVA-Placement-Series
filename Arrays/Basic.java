package Arrays;

public class Basic {
    //Basic Declaration and Initialization of Arrays
    public static void main(String[] args) {
        int marks[]={97,98,99};
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //Inside loop
        System.out.println("Inside Loop");
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }

}
