public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("------------------------------\n");

        System.out.println("Running Use Case 1:");
        usecase1();

        System.out.println("\nRunning Use Case 2:");
        usecase2();

        System.out.println("\nRunning Use Case 3:");
        usecase3();

        System.out.println("\nRunning Use Case 4:");
        usecase4();

        System.out.println("\nRunning Use Case 5:");
        usecase5();
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

    // UC3
    public static void usecase3() {
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (reversed.equals(input)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    // UC4
    public static void usecase4() {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0, end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    // UC5
public static void usecase5() {
    String input = "noon";
    java.util.Stack<Character> stack = new java.util.Stack<>();

    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    boolean isPalindrome = true;

    for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
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