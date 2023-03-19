package Libraries;

public class EqualsMethodExample1 {
    //Program to Show Equals Method
    int marks;
    public EqualsMethodExample1(int marks) {
        this.marks = marks;
    }
    public boolean equals(Object obj){     //Object obj=new EqualsMethod();
        EqualsMethodExample1 e=(EqualsMethodExample1) obj;
        return this.marks==e.marks;        //e1.marks==e2.marks
    }
    public static void main(String[] args) {
        EqualsMethodExample1 e1=new EqualsMethodExample1(96);
        EqualsMethodExample1 e2=new EqualsMethodExample1(96);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}
