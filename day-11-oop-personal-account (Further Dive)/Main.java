package ac.dia.oop;

public class Main {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.setAccountNo(1001);
		acc1.setAccountTitle("Rudra");
		acc1.setAccountBalance(50000);
		
		Account acc2 = new SavingsAccount();
		acc2.setAccountNo(1002);
		acc2.setAccountTitle("Ninjax");
		acc2.setAccountBalance(10000);
		
		Transaction trans1 = new Transaction();
		trans1.setTransId(101);
		trans1.deposit(acc1, 10000);
		
		Transaction trans2 = new Transaction();
		trans2.setTransId(102);
		trans2.withdraw(acc1, 500);
		
		AccountTransfer trans3 = new AccountTransfer();
		trans3.setTransId(103);
		trans3.transfer(acc1, acc2, 5000);
		
		acc1.display();
		acc2.display();

	}

}
