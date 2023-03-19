package Libraries;

public class EqualsMethodExample2 {
    //Example Program to Implement Equals method
    int age;
    String name;
    EqualsMethodExample2(int age,String name){
        this.age=age;
        this.name=name;
    }
    public boolean equals(Object obj){
        EqualsMethodExample2 e=(EqualsMethodExample2) obj;
        return this.age==e.age && this.name==e.name;
    }
    public static void main(String[] args) {
        EqualsMethodExample2 e1=new EqualsMethodExample2(25,"Scott");
        EqualsMethodExample2 e2=new EqualsMethodExample2(25,"Tom");
        System.out.println(e1.equals(new EqualsMethodExample2(25,"Scott")));
        System.out.println(e1.equals(e2));
        if(e1.equals(e2)){
            System.out.println("age & name are same");
        }else{
            System.out.println("age & name are different");
        }
    }
}
