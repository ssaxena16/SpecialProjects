class Account {
	private int accountNumber;
	private int amount;
	private String customerName;

	public void insertAccountDetail(int accountNumber, int amount, String customerName) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customerName = customerName;
	}

	public void checkBalance() {
		System.out.println("Balance of" + " " + accountNumber + " " + "is == " + amount);
	}

	public void deposite(int amt) {
		amount = amount + amt;
		
	}

	public void withdrawn(int amt) {
		amount = amount - amt;
	}

}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.insertAccountDetail(11011, 60000, "Sachin");
		account.checkBalance();
		account.deposite(6500);
		account.checkBalance();
		account.withdrawn(20000);
		account.checkBalance();

	}

}
