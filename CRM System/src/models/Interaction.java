package models;

import java.time.LocalDateTime;

public class Interaction {
    private String customerName;
    private String interactionType; // e.g., "Call", "Meeting", etc.
    private String notes;
    private LocalDateTime timestamp;

    public Interaction(String customerName, String interactionType, String notes) {
        this.customerName = customerName;
        this.interactionType = interactionType;
        this.notes = notes;
        this.timestamp = LocalDateTime.now(); // Automatically set the current time
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getInteractionType() {
        return interactionType;
    }

    public String getNotes() {
        return notes;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Interaction{" +
                "customerName='" + customerName + '\'' +
                ", interactionType='" + interactionType + '\'' +
                ", notes='" + notes + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
