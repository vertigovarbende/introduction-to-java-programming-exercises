package ch11.exercises.ch11_e08;

public class TestAccount {

	public static void main(String[] args) {
		Account myAccount = new Account(1122, "George", 1000);
		myAccount.setAnnualInterestRate(1.5);
		
		myAccount.deposit(30);
		myAccount.deposit(40);
		myAccount.deposit(50);
		
		myAccount.withdraw(5);
		myAccount.withdraw(4);
		myAccount.withdraw(2);
		
		System.out.println(myAccount);
	}
}
