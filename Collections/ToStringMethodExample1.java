package Collections;

public class ToStringMethodExample1 {
    int id;
    String name;
    ToStringMethodExample1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Id of "+name+" is "+id;
    }
    public static void main(String[] args) {
        ToStringMethodExample1 t=new ToStringMethodExample1(101,"Tom");
        ToStringMethodExample1 t1=new ToStringMethodExample1(121,"Jack");
        System.out.println(t+"\n"+t1);
    }
}
