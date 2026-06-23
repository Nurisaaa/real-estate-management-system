package models;

public class Client {
    private long id;
    private String fullName;
    private String phoneNumber;
    private double budget;

    public Client(long id, String fullName, String phoneNumber, double budget) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.budget = budget;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
