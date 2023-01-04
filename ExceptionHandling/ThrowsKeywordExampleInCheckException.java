package ExceptionHandling;

import java.io.FileReader;

public class ThrowsKeywordExampleInCheckException {
    //Implementing Throws Keyword Example In Check Exception
    static void display()throws Exception{
        for(int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
    void readData()throws Exception{
        FileReader f=new FileReader("dinga.txt");
    }
    public static void main(String[] args) {
        System.out.println("Start");
        ThrowsKeywordExampleInCheckException t=new ThrowsKeywordExampleInCheckException();
        try {
            display();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            t.readData();
        }
        catch (Exception e){
            System.out.println("File Not Present");
        }
        System.out.println("End");
    }
}
