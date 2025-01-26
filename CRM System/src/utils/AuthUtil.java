package utils;

import models.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthUtil {
    private static Map<String, String> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        users.put("admin", "password");
    }

    public static boolean authenticate() {
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Authentication successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
