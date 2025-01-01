package services;

import models.Interaction;
import java.util.ArrayList;
import java.util.Scanner;

public class InteractionService {
    private static ArrayList<Interaction> interactions = new ArrayList<>();

    public static void logInteraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter interaction type (e.g., Call, Meeting): ");
        String interactionType = scanner.nextLine();
        System.out.print("Enter notes: ");
        String notes = scanner.nextLine();

        Interaction interaction = new Interaction(customerName, interactionType, notes);
        interactions.add(interaction);
        System.out.println("Interaction logged successfully!");
    }

    public static void viewInteractions() {
        if (interactions.isEmpty()) {
            System.out.println("No interactions found.");
        } else {
            for (Interaction interaction : interactions) {
                System.out.println(interaction);
            }
        }
    }
}
