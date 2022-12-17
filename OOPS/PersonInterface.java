package OOPS;

interface PersonInterface {
    int id=101;
    void work();
}
class Jerry implements PersonInterface{
    @Override
    public void work(){
        System.out.println("jerry is working");
    }
    public static void main(String[] args) {
        System.out.println("id:"+id);
        Jerry j=new Jerry();
        j.work();
    }
}
