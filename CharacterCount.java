import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        System.out.println("Enter a character to find the number of times it Occur : ");
        char target = scan.next().charAt(0);

        str = str.toLowerCase();
        int result = countOccurrence(str, target);
        System.out.println("The character '" + target + "' occurs '" + result + "' times in the String ");
        scan.close();
    }

    static int countOccurrence(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}