package models;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email + ", Phone: " + phoneNumber;
    }
}
