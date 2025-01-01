package utils;

import models.User;
import java.util.ArrayList;
import java.util.Scanner;

public class AuthUtil {
    private static ArrayList<User> users = new ArrayList<>();

    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User registered successfully!");
    }

    public static boolean loginUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return true;
            }
        }
        System.out.println("Invalid credentials.");
        return false;
    }
}
