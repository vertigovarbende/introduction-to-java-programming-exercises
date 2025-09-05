package ch11.exercises.ch11_e03;

public class SavingsAccount extends Account {

	// Constructors

	// No-arg/Default constructor
	// +SavingsAccount()
	public SavingsAccount() {
		super();
	}

	// Smart constructor
	// +SavingsAccount(id: int, balance: double)
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nSavingsAccount[]";
	}
}
