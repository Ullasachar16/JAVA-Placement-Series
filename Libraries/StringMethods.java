package Libraries;

public class StringMethods {
    //program to show all string method operations
    public static void main(String[] args) {
        String s="Software Developer";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("Soft"));
        System.out.println(s.endsWith("oper"));
        System.out.println(s.indexOf('e'));
        System.out.println(s.contains("ware"));
        System.out.println(s.concat("in Amazon"));
        String a="java";
        String b="JavA";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
