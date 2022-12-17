package OOPS;

abstract class EmployeeAbstractMethod {
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
