import java.util.Scanner;
//this is the main method
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false; // Flag to check for valid input

        while (!isValidInput) { // Loop until valid input is entered
            try {
                // Ask user for account type
                System.out.print("Enter account type (Checking/Savings): ");
                String accountType = scanner.nextLine().trim().toLowerCase();

                Account account = null;

                if (accountType.equals("checking")) {
                    // Get Checking Account details
                    System.out.print("Enter account ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double overdraftLimit = scanner.nextDouble();

                    // Create Checking Account
                    account = new CheckingAccount(id, firstName, lastName, balance, overdraftLimit);

                } else if (accountType.equals("savings")) {
                    // Get Savings Account details
                    System.out.print("Enter account ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter transaction fee: ");
                    double transactionFee = scanner.nextDouble();

                    // Create Savings Account
                    account = new SavingsAccount(id, firstName, lastName, balance, transactionFee);

                } else {
                    System.out.println("Invalid account type entered. Please try again.");
                    continue; // Restart loop for invalid account type
                }

                // Show account details
                System.out.println("Account created successfully!");
                System.out.println(account);

                // Allow deposits/withdrawals
                while (true) {
                    System.out.print("Enter deposit amount (or 0 to skip): ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount != 0) {
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful. New balance: $" + account.getBalance());
                    }

                    System.out.print("Enter withdrawal amount (or 0 to skip): ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount != 0) {
                        account.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
                    }

                    System.out.print("Would you like to continue? (yes/no): ");
                    String choice = scanner.next();
                    if (choice.equalsIgnoreCase("no")) {
                        break;
                    }
                }

                isValidInput = true; // Input is valid, exit loop
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
