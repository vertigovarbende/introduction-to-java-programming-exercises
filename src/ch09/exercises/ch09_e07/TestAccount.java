package ch09.exercises.ch09_e07;

public class TestAccount {

	public static void main(String[] args) {
		// Creating instance
		Account myAccount = new Account(1122, 20_000);
		
		// withdraw(2500)
		System.out.println("balance: " + myAccount.getBalance());
		myAccount.withdraw(2500);
		System.out.println("balance: " + myAccount.getBalance());
		
		System.out.println();
		
		// deposit
		System.out.println("balance: " + myAccount.getBalance());
		myAccount.deposit(3000);
		System.out.println("balance: " + myAccount.getBalance());
		
		System.out.println();
		
		// monthly interest, date
		System.out.println("monthly interest " + myAccount.getMonthlyInterest());
		System.out.println("dateCreated: " + myAccount.getDateCreated());
	}
}
