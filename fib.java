import java.util.Scanner;

public class fib {
    // Recursive method to calculate the nth Fibonacci number
    public static int fib(int num) {
        if (num == 1) {
            return 0; // First Fibonacci number is 0
        }
        if (num == 2) {
            return 1; // Second Fibonacci number is 1
        }
        return fib(num - 1) + fib(num - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        // Calculate the Fibonacci number and store the result
        int result = fib(num);

        // Print the result
        System.out.println("The " + num + "th Fibonacci number is: " + result);
    }
}