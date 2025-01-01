import utils.AuthUtil;
import services.CustomerService;
import services.InteractionService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        System.out.println("Welcome to the CRM System!");

        // Login or Register Loop
        while (!isLoggedIn) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    isLoggedIn = AuthUtil.loginUser();
                    break;
                case 2:
                    AuthUtil.registerUser();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // After login, show main menu
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Manage Customers");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");
            int mainChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (mainChoice) {
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
                    exit = true;
                    System.out.println("Logged out successfully!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
