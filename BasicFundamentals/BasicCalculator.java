package BasicFundamentals;

import java.util.Scanner;

public class BasicCalculator {
    //Program to Implement Basic Calculator Using Operators
    public static void main(String[] args) {
             /*   //Basic Calculator Assignment

                Scanner sc=new Scanner(System.in);
                System.out.println("enter value for a:");
                int a=sc.nextInt();
                System.out.println("enter value for b:");
                int b=sc.nextInt();
                System.out.println("enter choice:");
                int choice=sc.nextInt();
                switch (choice){
                    case 1:int add=(a+b);
                        System.out.println("addition:"+add);
                        break;
                    case 2:int sub=(a-b);
                        System.out.println("subtraction:"+sub);
                        break;
                    case 3:int mul=(a*b);
                        System.out.println("multiplication:"+mul);
                        break;
                    case 4:int div=(a/b);
                        System.out.println("division:"+div);
                        break;
                    case 5:int mod=(a%b);
                        System.out.println("modulo:"+mod);
                        break;
                    default:
                        System.out.println("Invalid");
                } */

        char operator;
        double number1, number2, result;

        // Create an Object of Scanner Class
        Scanner input = new Scanner(System.in);

        // Ask Users to Enter Operator
        System.out.println("Choose an operator: +, -, *, /, or %");
        operator = input.next().charAt(0);

        // Ask Users to Enter Numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // Performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // Performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // Performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // Performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println(number1 + " % " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
        }
    }

