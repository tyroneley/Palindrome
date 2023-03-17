import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------");
            System.out.println("Palindrome Reader");
            System.out.println("INPUT a string:");
            System.out.println("---------------------------");
            String input = scn.nextLine();
            if (input == "X") {
                scn.close();
                System.out.println("Exiting program");
                System.exit(0);
            } else {
                if (Reader.isPalindrome(input)) {
                    System.out.println("RESULT:");
                    System.out.println("\"" + input + "\"" + " is a palindrome my guy!");
                } else {
                    System.out.println("RESULT:");
                    System.out.println("\"" + input + "\"" + " is not a palindrome my guy.");
                }
            }
        }
    }
}
