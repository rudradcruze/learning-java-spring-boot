package ac.dia.shortcourse;

public class Main {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.showDetails();	// Show default cause the value is not set yet.
		
		account.setAccountNo(1001);
		account.setAccountTitle("Rudra");
		account.setAccountBalance(15000);
		
		// Details show after set
		account.showDetails();
		
		// Deposit and show
		System.out.println("------ Deposit ------");
		account.deposit(10000);
		account.showDetails();
		
		// Withdraw and show
		System.out.println("------ Withdraw ------");
		account.withdraw(30000);
		account.showDetails();
	}
}
