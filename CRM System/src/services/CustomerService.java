package services;

import models.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private static final List<Customer> customers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    // Add a new customer to the list
    public static void addCustomer() {
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine().trim();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine().trim();

        if (name.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        String id = "CUST" + (customers.size() + 1); // Generate unique ID
        customers.add(new Customer(id, name, email, phoneNumber));
        System.out.println("Customer added successfully! ID: " + id);
    }

    // View all customers
    public static void viewCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers available.");
            return;
        }
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    // Search for a customer by name or ID
    public static void searchCustomer() {
        System.out.print("Enter Customer Name or ID: ");
        String query = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        for (Customer customer : customers) {
            if (customer.getId().toLowerCase().contains(query) || customer.getName().toLowerCase().contains(query)) {
                System.out.println(customer);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching customer found.");
        }
    }
}
