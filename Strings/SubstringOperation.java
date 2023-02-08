package Strings;

public class SubstringOperation {
    //Program to perform substring operation
    public static void main(String[] args) {
        //Substring
        String sentence="TonyStark";
        String name=sentence.substring(4);
        System.out.println(name);

        //parseInt Method
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //toString Method
        number = 123;
        str = Integer.toString(number);
        System.out.println(str.length());

    }
}
