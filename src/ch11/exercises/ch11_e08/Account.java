package ch11.exercises.ch11_e08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	// The private instance variables
	private int id; // id for the account
	private String name; // store the name of the customer
	private double balance; // account's balance
	private double annualInterestRate; // stores the current interest rate (percent)
	private Date dateCreated; // stores the date when the account was created
	private ArrayList<Transaction> transactions;

	// Constructors

	// No-arg/Default constructor
	// +Account()
	public Account() {
		id = 0;
		name = "non-defined";
		balance = 0;
		annualInterestRate = 4.5;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	// Smart constructor
	// +Account(id: int, name: String, balance: double)
	public Account(int id, String name, double balance) {
		setId(id);
		setBalance(balance);
//		this.id = id;
//		this.balance = balance;
		this.name = name;
		annualInterestRate = 4.5;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Setter method for private instance variable 'id'
	public void setId(int id) {
		this.id = id < 0 ? this.id : id;
	}
	
	// Getter method for private instance variable 'name'
	public String getName() {
		return name;
	}
	
	// Setter method for private instance variable 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for private instance variable 'balance'
	public double getBalance() {
		return balance;
	}

	// Setter method for private instance variable 'balance'
	public void setBalance(double balance) {
		this.balance = balance < 0 ? this.balance : balance;
	}

	// Getter method for private instance variable 'annualInterestRate'
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Setter method for private instance variable 'annualInterestRate'
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate < 0 ? this.annualInterestRate : annualInterestRate;
	}

	// Getter method for private instance variable 'dateCreated'
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Getter method for private instance variable 'transactions'
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	// +getMonthlyInterestRate(): double
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = (annualInterestRate / 100) / 12;
		return monthlyInterestRate;
//		return (annualInterestRate / 100) / 12;
	}

	// +getMonthlyInterest(): double
	public double getMonthlyInterest() {
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
//		return balance * getMonthlyInterestRate();
	}

	// +withdraw(amount: double): void
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("you cannot withdraw this amount! please enter new amount");
		} else if (amount > balance) {
			System.out.println("you don't have enough money in your account");
		} else {
			balance -= amount;
			Transaction transaction = new Transaction('W', amount, balance, "$" + amount + " cash withdrawal transaction");
			transactions.add(transaction);
			System.out.println("you withdrew $" + amount + "from your account");
		}
	}

	// +deposit(amount: double): void
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("you cannot deposit this amount! please enter new amount");
		} else {
			balance += amount;
			Transaction transaction = new Transaction('D', amount, balance, "$" + amount + " cash deposit transaction");
			transactions.add(transaction);
			System.out.println("you deposit $" + amount + " in your account");
		}
	}
	
	// toString()
	@Override
	public String toString() {
		return "Account[id=" + id
				+ ",balance=" + balance
				+ ",annualInterestRate=" + annualInterestRate
				+ ",dateCreated=" + dateCreated
				+ "\ntransactions=\n" + transactions
				+ "]";
	}
}