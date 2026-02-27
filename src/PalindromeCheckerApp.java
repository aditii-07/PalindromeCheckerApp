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
}