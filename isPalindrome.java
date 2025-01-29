import java.util.Scanner;

public class isPalindrome {
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        s = s.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        if (isPalindrome(s)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }
}