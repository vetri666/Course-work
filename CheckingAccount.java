class CheckingAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(int id, String firstName, String lastName, double balance, double overdraftLimit) {
        super(id, firstName, lastName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double getMonthlyInterestRate() {
        return 0; // Checking accounts typically have no monthly interest rate
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);  // Simple deposit operation
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Error: Exceeds overdraft limit.");
        } else {
            setBalance(getBalance() - amount);  // Withdraw up to overdraft limit
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Overdraft Limit: $" + overdraftLimit;
    }
}
