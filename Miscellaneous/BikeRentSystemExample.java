package Miscellaneous;

public class BikeRentSystemExample {
    //Program to implement Bike Rental System
    String name;
    int cc,model,days,r;

    public BikeRentSystemExample(String name, int cc, int model, int days) {
        this.name = name;
        this.cc = cc;
        this.model = model;
        this.days = days;
    }
    public void rent(){
        if(name == "abc" && cc == 100 && model == 1){
            if(days == 1){
                r=500;
                System.out.println(r);
            } else if (days == 2) {
                r = 400;
                System.out.println(r);
            }else if(days >=3){
                r = 350;
                System.out.println(r);
            }
        }else if(name == "xyz" && cc == 125 && model == 2){
            if(days == 1){
                r=600;
                System.out.println(r);
            } else if (days == 2) {
                r = 500;
                System.out.println(r);
            }else if(days >=3){
                r = 500;
                System.out.println(r);
            }
        }
        else if(name == "pqr" && cc == 150 && model == 3){
            if(days == 1){
                r=800;
                System.out.println(r);
            } else if (days == 2) {
                r = 700;
                System.out.println(r);
            }else if(days >=3){
                r = 850;
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args) {
        BikeRentSystemExample b = new BikeRentSystemExample("xyz",125,2,2);
        System.out.println("Rent is:");
        b.rent();
    }
}
