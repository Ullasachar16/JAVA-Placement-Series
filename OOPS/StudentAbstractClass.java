package OOPS;

abstract class StudentAbstractClass {
    StudentAbstractClass(String name){
        System.out.println("Hi "+name);
    }
}
class Tom extends StudentAbstractClass{
    Tom(){
        super("Jack");
        System.out.println("Hi Tom");
    }
    public static void main(String[] args) {
        Tom t=new Tom();
    }
}
