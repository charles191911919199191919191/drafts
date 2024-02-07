// CHARLES KURAIS BSIT - 1C
// NOV 15, 2023

import java.util.Scanner;

public class lol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integers x, y, and z
        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        // Validate that x is lesser than y
        if (x >= y) {
            System.out.println("Invalid input. Please make sure x is lesser than y.");
            return;
        }

        System.out.print("Enter z: ");
        int z = scanner.nextInt();

        // Check if z is within x and y (inclusive)
        if (z >= x && z <= y) {
            System.out.println(z + " is just within " + x + " and " + y);
        } else {
            // Calculate absolute differences
            int diffX = Math.abs(x - z);
            int diffY = Math.abs(y - z);

            // Compare absolute differences and print the appropriate message
            if (diffX > diffY) {
                System.out.println(z + " is farther from " + x);
            } else {
                System.out.println(z + " is farther from " + y);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
