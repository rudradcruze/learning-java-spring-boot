package ac.dia.shortcourse;

public class Account {
	
	private int accountNo;
	private String accountTitle;
	private double accountBalance;
	
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountTitle() {
		return accountTitle;
	}
	
	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit(double amount) {
		accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		
		if(amount > getAccountBalance())
			return;

		accountBalance -= amount;
	}
	
	public void showDetails() {
		System.out.println("------ Account Information ------");
		System.out.println("---------------------------------");
		System.out.println("- Account No: " + getAccountNo());
		System.out.println("- Account Title: " + getAccountTitle());
		System.out.println("- Account Balance: " + getAccountBalance());
		System.out.println("---------------------------------\n");
	}
}
