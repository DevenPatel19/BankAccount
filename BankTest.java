public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
		BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
		account1.deposit(1000, "checking");
        account2.deposit(1500, "savings");
        account3.deposit(500, "checking");

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
		account1.withdraw(200, "checking");
        account2.withdraw(300, "savings");
        account3.withdraw(700, "checking");

        // Static Test (print the number of bank accounts and the totalMoney)
		System.out.println("Number of accounts: " + BankAccount.getAccounts());
        System.out.println("Total money: " + BankAccount.getTotalMoney());

		// Display account information
        System.out.println("Account 1 - Balance: $" + account1.getBalance());
        System.out.println("Account 2 - Balance: $" + account2.getBalance());
        System.out.println("Account 3 - Balance: $" + account3.getBalance());

    }
}
