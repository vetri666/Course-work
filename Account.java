import java.util.Date;

abstract class Account {
    private int id;
    private String firstName;
    private String lastName;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor
    public Account() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Constructor with arguments
    public Account(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Getters and setters for all fields
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate; }

    public Date getDateCreated() { return dateCreated; }
    public void setDateCreated(Date dateCreated) { this.dateCreated = dateCreated; }

    // Abstract methods to be implemented by subclasses
    public abstract double getMonthlyInterestRate();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // To display basic account info
    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName +
               ", Balance: $" + balance + ", Date Created: " + dateCreated;
    }
}
