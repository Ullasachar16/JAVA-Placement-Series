package OOPS;

public class SingleLevelInheritance {}
//Program to implement single-level inheritance
    class Father{
        int age=45;
    }
    class Son extends Father{
        String name="Tom";

        public static void main(String[] args) {
            Son s=new Son();
            System.out.println(s.age);
            System.out.println(s.name);
        }
    }



