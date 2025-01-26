package services;

import models.Interaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractionService {
    private static List<Interaction> interactions = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void logInteraction() {
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter Interaction Details: ");
        String details = scanner.nextLine();

        interactions.add(new Interaction(customerId, details));
        System.out.println("Interaction logged successfully!");
    }

    public static void viewInteractions() {
        if (interactions.isEmpty()) {
            System.out.println("No interactions found.");
        } else {
            System.out.println("Interactions:");
            for (Interaction interaction : interactions) {
                System.out.println(interaction);
            }
        }
    }
}
