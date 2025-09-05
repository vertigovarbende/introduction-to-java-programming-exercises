package ch11.exercises.ch11_e03;

public class CheckingAccount extends Account {

	// The private instance variable
	private double limit;
	
	// Constructors
	
	// No-arg/Default constructor
	// +CheckingAccount()
	public CheckingAccount() {
		super();
		limit = super.getBalance() + 3000;
	}
	
	// Smart constructor
	// +CheckingAccount(id: int, balance: double)
	public CheckingAccount(int id, double balance) {
		super(id, balance);
		limit = super.getBalance() + 3000;
	}
	
	// Smart constructor
	// +CheckingAccount(id: int, balance: double, limit: double)
	public CheckingAccount(int id, double balance, double limit) {
		super(id, balance);
		this.limit = balance + limit;
	}
	
	// Getter method for private instance variable 'limit'
	public double getLimit() {
		return limit;
	}
	
	// +withdraw(amount: double)
	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("you cannot withdraw this amount! please enter new amount");
		} else if (amount > limit) {
			System.out.println("you don't have enough money limit in your account");
		} else {
			limit -= amount;
			super.setBalance(super.getBalance() - amount);
			System.out.println("you withdrew $" + amount + " from your account");
		}
	}
	
	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nCheckingAccount["
				+ "limit=" + limit
				+ "]";
	}	
}
