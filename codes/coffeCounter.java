package codes;
import java.util.*;
public class coffeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter customer name or type 'exit' to quit: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            double total = 0;
            while (true) {
                System.out.println("Choose coffee type:\n1. Espresso (₹100)\n2. Latte (₹150)\n3. Cappuccino (₹200)");
                int choice = sc.nextInt();
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                
                switch (choice) {
                    case 1 -> total += 100 * quantity;
                    case 2 -> total += 150 * quantity;
                    case 3 -> total += 200 * quantity;
                    default -> System.out.println("Invalid coffee type");
                }

                System.out.print("Order more? (yes/no): ");
                sc.nextLine(); // consume leftover newline
                if (sc.nextLine().equalsIgnoreCase("no")) break;
            }

            double gst = total * 0.18;
            System.out.printf("Total (including 18%% GST): ₹%.2f\n", total + gst);
        }

        sc.close();
    }
}
