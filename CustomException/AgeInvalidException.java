package CustomException;

import java.util.Scanner;

public class AgeInvalidException extends Exception{
    //Program to Implement Custom Exception Using Custom Age-Invalid-Exception
    private String message;
    AgeInvalidException(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
class Vote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            try {
                throw new AgeInvalidException("Hey Kiddo, wait for ur time");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}