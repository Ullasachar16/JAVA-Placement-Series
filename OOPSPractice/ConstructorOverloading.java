package OOPSPractice;

public class ConstructorOverloading {
    ConstructorOverloading(int id){
        System.out.println(id);
    }
    ConstructorOverloading(String name,int age){
        System.out.println(name+" "+age);
    }
    ConstructorOverloading(double salary){
        System.out.println(salary);
    }
    ConstructorOverloading(int age,String name){
        System.out.println(age+" "+name);
    }
}
class Solu{
    public static void main(String[] args) {
        ConstructorOverloading c=new ConstructorOverloading(102.35);
        new ConstructorOverloading(45);
        new ConstructorOverloading(45,"tom");
        ConstructorOverloading c1=new ConstructorOverloading("jack",45);
    }
}
