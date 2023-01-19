package OOPS;

import java.util.Scanner;

class Beverage{
    //program to implement inheritance
}
class Coffee extends Beverage{
}
class Tea extends Beverage{
}
class Cafe{
    Beverage vendingMachine(int choice){
        if(choice==1){
            return new Coffee();
        }else if(choice == 2){
            return new Tea();
        }else {
            return null;
        }
    }
}
public class User {
    public static void main(String[] args) {
        Cafe c=new Cafe();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for coffee and 2 for Tea");
        int choice=sc.nextInt();
        Beverage obj=c.vendingMachine(choice);
        if(obj instanceof Coffee){
            System.out.println("Drinking Coffee");
        }else if(obj instanceof Tea){
            System.out.println("Drinking Tea");
        }else{
            System.out.println("Invalid");
        }
    }
}
