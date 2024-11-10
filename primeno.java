import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter the 10 number");
        for(int i =0; i<10; i++){
            numbers[i] = scan.nextInt();
        }
        for(int number :numbers){
            primecheck(number);
        }
    scan.close();
    }
    static void primecheck(int n){
        int count =0;
        if(n<= 1){
            count =2;
        }
        for (int i =1; i<= Math.sqrt(n);i++){
            if (n % i ==0){
                count++;
            }
        }
        if (count<=1){
            System.out.println(n+ " :is a prime number");
        }else{
            System.out.println(n+ " :is not a prime number");
        }
    }
}
