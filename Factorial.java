import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you want to know the factorial.");
        int number = scan.nextInt();
        int factorial = 1;
        for(int i=1 ; i <= number ; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + number+ " is: " + factorial);
        sum(factorial);
        scan.close();
    }
    static void sum(int fact){
        int sum = 0;
        while(fact>0){
            int rem = fact %10;
            sum = rem +sum;
            fact= fact/10;
        }
        System.out.println("The sum of factorial is :" +sum);
    }
}
