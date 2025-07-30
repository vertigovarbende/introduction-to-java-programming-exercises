package ch10.exercises.ch10_e07;

import java.util.Scanner;

public class ATM implements Operations {

	// The private instance variable
	private static final Scanner INPUT = new Scanner(System.in);
	private Account[] accounts;
	private Account currentAccount;

	// Constructor

	// Smart constructor
	// +ATM(accounts: Account[])
	public ATM(Account[] accounts) {
		this.accounts = accounts;
	}

	// +start(): void
	// this method will start the ATM system
	public void start() {
		int choice = 0;
		while (true) {
			System.out.print("Enter an id: ");
			int checkedId = INPUT.nextInt();
			if (!checkId(checkedId))
				System.out
						.println("There is no account registered with this ID number. Please enter a valid ID number");
			else
				currentAccount = getAccount(checkedId);

			do {
				String transactions = "Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit";
				System.out.println("\n" + transactions);
				System.out.print("Enter a choice: ");
				choice = INPUT.nextInt();
				double amount = 0.0;

				if (choice == 1)
					System.out.println("The balance is " + checkBalance());
				else if (choice == 2) {
					System.out.print("Enter an amount to withdraw: ");
					amount = INPUT.nextDouble();
					withdraw(amount);
				} else if (choice == 3) {
					System.out.print("Enter an amount to deposit: ");
					amount = INPUT.nextDouble();
					deposit(amount);
				} else if (choice == 4) {
					System.out.println();
					break;
				} else
					System.out.println("Please enter an valid choice");
			} while (choice != 4);
		}
	}

	// -checkId(id: int): boolean
	// this method checks whether there is an account with specified id, if there
	// is, then returns true
	private boolean checkId(int id) {
		for (int i = 0; i < accounts.length; ++i)
			if (accounts[i].getId() == id)
				return true;
		return false;
	}

	private Account getAccount(int id) {
		for (int i = 0; i < accounts.length; ++i)
			if (accounts[i].getId() == id)
				currentAccount = accounts[i];
		return currentAccount;
	}

	public double checkBalance() {
		return currentAccount.getBalance();
	}

	public void withdraw(double amount) {
		currentAccount.withdraw(amount);
	}

	public void deposit(double amount) {
		currentAccount.deposit(amount);
	}
}
