package OOPS;

public class Solution1{
    //Support class for another program to access through different packages
    static void display(Father3 obj){
        if(obj instanceof Son3){
            Son3 s=(Son3) obj;
            System.out.println(s.x+" "+s.y);
        }else if(obj instanceof Daughter){
            Daughter d=(Daughter) obj;
            System.out.println(d.x+" "+d.z);
        }
    }
    public static void main(String[] args) {
        display(new Son3());
        display(new Daughter());
    }
}
