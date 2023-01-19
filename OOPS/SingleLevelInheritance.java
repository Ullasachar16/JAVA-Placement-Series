package OOPS;

public class SingleLevelInheritance {}
//program to implement singlelevel inheritance
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



