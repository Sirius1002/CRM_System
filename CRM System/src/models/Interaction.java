package models;

public class Interaction {
    private String customerId;
    private String interactionDetails;

    public Interaction(String customerId, String interactionDetails) {
        this.customerId = customerId;
        this.interactionDetails = interactionDetails;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getInteractionDetails() {
        return interactionDetails;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Interaction: " + interactionDetails;
    }
}
