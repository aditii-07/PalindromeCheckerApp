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

        System.out.println("\nRunning Use Case 6:");
        usecase6();

        System.out.println("\nRunning Use Case 7:");
        usecase7();

        System.out.println("\nRunning Use Case 8:");
        usecase8();

        System.out.println("\nRunning Use Case 9:");
        usecase9();

        System.out.println("\nRunning Use Case 10:");
        usecase10();

        System.out.println("\nRunning Use Case 11:");
        usecase11();

        System.out.println("\nRunning Use Case 12:");
        usecase12();
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

      // UC6 
public static void usecase6() {

    String input = "civic";

    java.util.Queue<Character> queue = new java.util.LinkedList<>();
    java.util.Stack<Character> stack = new java.util.Stack<>();

    for (char c : input.toCharArray()) {
        queue.add(c);
        stack.push(c);
    }

    boolean isPalindrome = true;

    while (!queue.isEmpty()) {
        if (!queue.poll().equals(stack.pop())) {
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

      // UC7 
public static void usecase7() {

    String input = "refer";

    java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

    for (char c : input.toCharArray()) {
        deque.add(c);
    }

    boolean isPalindrome = true;

    while (deque.size() > 1) {
        if (!deque.removeFirst().equals(deque.removeLast())) {
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
    // UC8
    public static void usecase8() {

        String input = "level";
        Node head = createLinkedList(input);
        boolean isPalindrome = isPalindromeLinkedList(head);
        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createLinkedList(String input) {

        if (input == null || input.length() == 0)
            return null;

        Node head = new Node(input.charAt(0));
        Node current = head;

        for (int i = 1; i < input.length(); i++) {
            current.next = new Node(input.charAt(i));
            current = current.next;
        }

        return head;
    }

    public static boolean isPalindromeLinkedList(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // UC9
    public static void usecase9() {

        String input = "madam";
        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // UC10
    public static void usecase10() {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = isPalindromeRecursive(normalized, 0, normalized.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    // UC11
    public static void usecase11() {

        String input = "Level";
        PalindromeService service = new PalindromeService();

        boolean isPalindrome = service.checkPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    static class PalindromeService {

        public boolean checkPalindrome(String input) {
            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            int start = 0;
            int end = normalized.length() - 1;
            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    // UC12
    public static void usecase12() {

        String input = "racecar";

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.check(input);

        if (result) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    interface PalindromeStrategy {
        boolean isPalindrome(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean isPalindrome(String input) {

            java.util.Stack<Character> stack = new java.util.Stack<>();
            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            for (char c : normalized.toCharArray()) {
                stack.push(c);
            }

            for (char c : normalized.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    static class DequeStrategy implements PalindromeStrategy {

        public boolean isPalindrome(String input) {

            java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            for (char c : normalized.toCharArray()) {
                deque.add(c);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String input) {
            return strategy.isPalindrome(input);
        }
    }
}