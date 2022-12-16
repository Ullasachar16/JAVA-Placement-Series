package OOPS;

public class ArrayEx1 {
    int age;
    String name;

    ArrayEx1(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
class solut{
    public static void main(String[] args) {
        ArrayEx1 ax=new ArrayEx1(45,"tom");
        ArrayEx1 ax1=new ArrayEx1(54,"jack");
        ArrayEx1[] s={ax,ax1};
        for(int i=0;i< s.length;i++){
            System.out.println(s[i].age+" "+s[i].name);
        }

    }
}
