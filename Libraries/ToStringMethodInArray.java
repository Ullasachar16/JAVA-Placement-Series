package Libraries;

public class ToStringMethodInArray {
    //Program to show the use of string method in array
    String name;
    double ratings;
    public ToStringMethodInArray(String name, double ratings) {
        this.name = name;
        this.ratings = ratings;
    }
    public String toString(){
        return "The hotel "+name+" has "+ratings;
    }
    public static void main(String[] args) {
        ToStringMethodInArray t1=new ToStringMethodInArray("Taj",4.5);
        ToStringMethodInArray t2=new ToStringMethodInArray("ITC",4.8);
        ToStringMethodInArray[] t={t1,t2};
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
