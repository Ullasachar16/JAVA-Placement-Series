package OOPS;

abstract class EmployeeAbstractMethod {
    //program to show the usage of abstract method
    abstract void work();
}
class Developer1 extends EmployeeAbstractMethod{
    @Override
    void work(){
        System.out.println("Working");
    }
    public static void main(String[] args) {
        Developer1 d=new Developer1();
        d.work();
    }
}
