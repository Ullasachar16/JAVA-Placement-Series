package OOPS;

public class Country {
    //Example program for constructor
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("population:"+population);
    }
}
class Solutio{
    public static void main(String[] args) {
        Country c1=new Country("India",130);
        Country c2=new Country("USA",35);
        Country c3=new Country("China",160);
        Country c4=new Country("Sri Lanka",2);
        Country c5=new Country("India",50);
        Country[] c={c1,c2,c3,c4,c5};
        for(int i=0;i<c.length;i++){
            c[i].display();
        }
        Country max=c[0];
        for(int i=1;i<c.length;i++){
            if(c[i].population>max.population){
                max=c[i];
            }
        }
        System.out.println("highest population\n"+"name:"+max.name+"\npopulation:"+max.population);

    }
}