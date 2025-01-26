import services.CustomerService;
import services.InteractionService;
import utils.AuthUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!AuthUtil.authenticate()) {
            return;
        }

        while (true) {
            System.out.println("\n=== Customer Management System ===");
            System.out.println("1. Customer Management");
            System.out.println("2. Interaction Tracking");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nCustomer Management:");
                    System.out.println("1. Add Customer");
                    System.out.println("2. View Customers");
                    System.out.println("3. Log Interaction");
                    System.out.println("4. View Interactions");
                    System.out.print("Choose an option: ");
                    int customerChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (customerChoice == 1) {
                        CustomerService.addCustomer();
                    } else if (customerChoice == 2) {
                        CustomerService.viewCustomers();
                    } else if (customerChoice == 3) {
                        InteractionService.logInteraction();
                    } else if (customerChoice == 4) {
                        InteractionService.viewInteractions();
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    InteractionService.viewInteractions();
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
