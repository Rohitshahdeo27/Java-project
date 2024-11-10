import java.util.Scanner;
public class Calculatorif {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        int select;
        double num1,num2,result;

        do{
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Select the option ");
            select = scan.nextInt();

            if(select ==5){
                System.out.println("Closing the calculator");
                break;
            }
            System.out.println("Enter the first number :");
            num1 = scan.nextDouble();
            System.out.println("Enter the second number :");
            num2 = scan.nextDouble();

            if (select ==1){
                result = num1 +num2;
                System.out.println("Addition of : "+ num1 + "and" + num2 + "is :"+ result);
            }else if (select ==2){
                result = num1 - num2;
                System.out.println("Substraction of : " + num1 + " and " + num2 + " is : " + result);
            } else if (select == 3) {
                result = num1 * num2;
                System.out.println("Multiplication of : " + num1 + " and " + num2 + " is : " + result);
            } else if (select == 4) {
                if (num2 == 0) {
                    System.out.println("Division by 0 is not allowed");
                } else {
                    result = num1 / num2;
                    System.out.println("Division of : " + num1 + " and " + num2 + " is : " + result);
                }
            } else {
                System.out.println("Enter a Valid choice.");
            }
        }
        while (select != 5);
        scan.close();
            }
        }
