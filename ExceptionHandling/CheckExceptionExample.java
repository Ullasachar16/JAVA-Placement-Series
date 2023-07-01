package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckExceptionExample {
    //Implementing Check Exception Example
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            FileReader f = new FileReader("guldu.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
//FileNotFoundException -> Checked Exception(Compiler known exception
// and it force user handle it immediately)
