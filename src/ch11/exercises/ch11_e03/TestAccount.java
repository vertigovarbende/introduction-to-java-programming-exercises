package ch11.exercises.ch11_e03;

public class TestAccount {
	
	public static void main(String[] args) {
		// Creating instance
		Account myAccount1 = new Account(1122, 20_000);
		Account myAccount2 = new CheckingAccount(1123, 20_000);
		Account myAccount3 = new CheckingAccount(1124, 20_000, 5000);
		Account myAccount4 = new SavingsAccount(1125, 20_000);
		
		System.out.println("\ntoString()\n");
		
		// Invoke toString()
		System.out.println(myAccount1);
		System.out.println(myAccount2);
		System.out.println(myAccount3);
		System.out.println(myAccount4);
		
		System.out.println("\nwithdraw()\n");
		
		// withdraw()
		myAccount1.withdraw(20_500); // we can't draw
		myAccount2.withdraw(23_000); // we can
		myAccount3.withdraw(25_000); // we can
		
		System.out.println(myAccount1);
		System.out.println(myAccount2);
		System.out.println(myAccount3);
		
		myAccount2.withdraw(1);
		myAccount3.withdraw(1);
		
	}

}
