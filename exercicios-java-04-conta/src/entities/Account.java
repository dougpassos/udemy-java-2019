package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private static double TAXA = 5.00;
	private String cabec = "Acount dada";

	public Account(int number, String holder, double initialDeposit) {
		
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
		cabec = "Updated Acount dada";
	}

	public void whithdraw(double amount) {
		this.balance -= (amount + TAXA);
		cabec = "Updated Acount dada";

	}

	public String toString() {
		return "\n" + cabec + ":\n" 
				+ "Account " + this.number + ", " 
				+ "Holder: " + this.holder + ", " 
				+ "Balance: $ "	+ String.format("%.2f", this.balance) + "\n";

	}

}
