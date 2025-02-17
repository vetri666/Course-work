class SavingsAccount extends Account {
    private double transactionFee;

    // Constructor
    public SavingsAccount(int id, String firstName, String lastName, double balance, double transactionFee) {
        super(id, firstName, lastName, balance);
        this.transactionFee = transactionFee;
    }

    @Override
    public double getMonthlyInterestRate() {
        return 0.05; // interest rate for savings
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount - transactionFee);  // Deposit after deducting transaction fee
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Error: Insufficient balance.");
        } else {
            setBalance(getBalance() - amount - transactionFee);  // Withdraw after deducting transaction fee
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Transaction Fee: $" + transactionFee;
    }
}
