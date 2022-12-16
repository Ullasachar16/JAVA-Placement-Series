package OOPSPractice;

public class ArraysEx2 {
    String name;
    double ratings;

    public ArraysEx2(String name, double ratings) {
        this.name = name;
        this.ratings = ratings;
    }
    void display(){
        System.out.println(name+" "+ratings);
    }
}
class Soluti{
    public static void main(String[] args) {
        ArraysEx2 ax=new ArraysEx2("ITC",4.5);
        ArraysEx2 ax1=new ArraysEx2("Taj",4.4);
        ArraysEx2 ax2=new ArraysEx2("Shanthi Sagar",3.0);
        ArraysEx2[] aa={ax,ax1,ax2};
        for(int i=0;i< aa.length;i++){
            aa[i].display();
        }
    }
}