public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("------------------------------\n");

        System.out.println("Running Use Case 1:");
        usecase1();

        System.out.println("\nRunning Use Case 2:");
        usecase2();
    }

    // UC1
    public static void usecase1() {
        System.out.println("Use Case 1: Welcome Message Module Executed Successfully");
    }

    // UC2
    public static void usecase2() {
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}