package OOPS;

public class EmployeeEncapsulation {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class MainClass{
    public static void main(String[] args) {
        EmployeeEncapsulation e=new EmployeeEncapsulation();
        e.setId(101);
        e.setName("Tom");
        System.out.println("Name:"+e.getName()+"\nID:"+e.getId());
    }
}

