package StringBuilder;

public class Example {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java");
        //how original string is changed
        sb.append(" is best");
        System.out.println(sb);
        System.out.println(sb.length());

        //allocated capacity
        System.out.println(sb.capacity());

        StringBuilder sb1=new StringBuilder("Android");
        sb1.insert(7," is cool");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("He is Superstar");
        System.out.println(sb2);
        sb2.replace(3,5,"was");
        System.out.println(sb2);

        StringBuilder sb3=new StringBuilder("Hello");
        sb3.delete(1,3);
        //prints Hlo
        System.out.println(sb3);
        sb3.deleteCharAt(0);
        System.out.println(sb3);

        StringBuilder sb4=new StringBuilder("Java");
        sb4.reverse();
        System.out.println(sb4);

        StringBuilder sb5=new StringBuilder("java");
        System.out.println(sb5.charAt(0));
        sb5.setCharAt(0,'k');
        System.out.println(sb5);

        StringBuilder sb6=new StringBuilder("He is superstar");
        String s=sb6.substring(6,11);
        System.out.println(s);
        s=sb6.substring(6);
        System.out.println(s);
    }
}
