public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
	private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances
	private String accountNumber;

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
	public BankAccount(){
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		 this.accountNumber = generateRandomAccountNumber();
        accounts++;
	}

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account

	public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

	public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking") && checkingBalance >= amount) {
            checkingBalance -= amount;
            totalMoney -= amount;
        } else if (accountType.equalsIgnoreCase("savings") && savingsBalance >= amount) {
            savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
	
    // getBalance
    // - display total balance for checking and savings of a particular bank account
	public double getBalance() {
        return checkingBalance + savingsBalance;
    }

	// Private method to generate a random ten-digit account number
    private String generateRandomAccountNumber() {
        // Implement this method to generate a random account number.
        // You can use Random or other methods to generate a unique number.
        // For simplicity, we'll just return a placeholder value for now.
        return "1234567890";
    }
}
