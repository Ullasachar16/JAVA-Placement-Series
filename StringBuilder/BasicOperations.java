package StringBuilder;

public class BasicOperations {
    //Program to Implement Basic Operations of String Builder Class
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //Insert
        sb.insert(2,'n');
        System.out.println(sb);

        //Delete
        sb.delete(2,4);
        System.out.println(sb);

        //Append
        sb.append("e");
        sb.append("r");
        System.out.println(sb);
        //Length
        System.out.println(sb.length());

    }
}
