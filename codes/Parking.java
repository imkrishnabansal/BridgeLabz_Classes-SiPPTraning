package codes;
import java.util.Scanner;
public class Parking {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int capacity = 5;
        int occupied = 0;
        int choice;

        while (true) {
            System.out.println("\nMenu:\n1. Park\n2. Exit\n3. Show Occupancy\n4. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Vehicle parked. Slots left: " + (capacity - occupied));
                    } else {
                        System.out.println("Parking lot is full!");
                    }
                }
                case 2 -> {
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Vehicle exited. Slots left: " + (capacity - occupied));
                    } else {
                        System.out.println("Parking lot is empty.");
                    }
                }
                case 3 -> System.out.println("Current Occupancy: " + occupied + "/" + capacity);
                case 4 -> {
                    System.out.println("Exiting system.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
