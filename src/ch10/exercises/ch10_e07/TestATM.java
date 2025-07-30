package ch10.exercises.ch10_e07;

public class TestATM {

	public static void main(String[] args) {
		Account[] accounts = {
				new Account(0, 100.0),
				new Account(1, 100.0),
				new Account(2, 100.0),
				new Account(3, 100.0),
				new Account(4, 100.0),
				new Account(5, 100.0),
				new Account(6, 100.0),
				new Account(7, 100.0),
				new Account(8, 100.0),
				new Account(9, 100.0)
		};
		ATM atm = new ATM(accounts);
		atm.start();
	}
}
