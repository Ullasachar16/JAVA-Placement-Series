package OOPS;

public class MethodOverloading {
    //program to implement method overloading
    //for both non-static and static methods overloading can be done
    //for static we need to use static keyword
    void display(int id){
        System.out.println(id);
    }
    void display(double height){
        System.out.println(height);
    }
    void display(int id,double height){
        System.out.println(id+" "+height);
    }
    void display(double height,int id){
        System.out.println(height+" "+id);
    }
}
class Main{
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.display(13);
        mo.display(2.5);
        mo.display(2.5,13);
        mo.display(13,2.5);
    }
}
