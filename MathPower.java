import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        int base = sc.nextInt(); // Read the base number
        int exponent = sc.nextInt(); // Read the exponent number
        System.out.println(Math.pow(base, exponent)); // Calculate and print the result
        sc.close(); // Close the scanner
    }
}
