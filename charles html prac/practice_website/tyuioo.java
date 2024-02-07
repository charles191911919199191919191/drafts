package practice_website;
import java.util.Scanner;

public class tyuioo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("XYZ PIZZA CORPORATION");
        System.out.println("Contact Information");
        
        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Address: ");
        String address = scanner.nextLine();
        
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        
        System.out.println("Order: ");
        String Order = scanner.nextLine();
        
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.println("Select Size:");
        System.out.println("1. Small 10\" - 120.00");
        System.out.println("2. Medium 12\" - 150.00");
        System.out.println("3. Large 15\" - 200.00");
        System.out.print("Enter Size: ");
        int sizeChoice = scanner.nextInt();
        double sizePrice = 0;
        
        switch (sizeChoice) {
            case 1:
                sizePrice = 120.00;
                break;
            case 2:
                sizePrice = 150.00;
                break;
            case 3:
                sizePrice = 200.00;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Small 10\".");
                sizePrice = 120.00;
                break;
        }
        
        System.out.println("Toppings:");
        System.out.println("1. Ham and Cheese - 50.00");
        System.out.println("2. Double Cheese - 60.00");
        System.out.println("3. Pepperoni - 40.00");
        System.out.print("Enter Toppings: ");
        int toppingsChoice = scanner.nextInt();
        double toppingsPrice = 0;
        
        switch (toppingsChoice) {
            case 1:
                toppingsPrice = 50.00;
                break;
            case 2:
                toppingsPrice = 60.00;
                break;
            case 3:
                toppingsPrice = 40.00;
                break;
            default:
                System.out.println("Invalid choice. No toppings selected.");
                break;
        }
        
        double totalAmount = (quantity * sizePrice) + toppingsPrice;
        
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Thank you!! " + customerName + " Enjoy your Meal!!!");
    }
}
