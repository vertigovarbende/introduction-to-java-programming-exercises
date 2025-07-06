package ch09.exercises.ch09_e07;

import java.util.Date;

public class Account {

	// The private instance variables
	private int id; // id for the account
	private double balance; // account's balance
	private double annualInterestRate; // stores the current interest rate (percent)
	private Date dateCreated; // stores the date when the account was created

	// Constructors

	// No-arg/Default constructor
	// +Account()
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// Smart constructor
	// +Account(id: int, balance: double)
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 4.5;
		dateCreated = new Date();
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'id'
	public int getId() {
		return id;
	}

	// Setter method for private instance variable 'id'
	public void setId(int id) {
		this.id = id;
	}

	// Getter method for private instance variable 'balance'
	public double getBalance() {
		return balance;
	}

	// Setter method for private instance variable 'balance'
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter method for private instance variable 'annualInterestRate'
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Setter method for private instance variable 'annualInterestRate'
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Getter method for private instance variable 'dateCreated'
	public Date getDateCreated() {
		return dateCreated;
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
			System.out.println("you withdrew $" + amount + "from your account");
		}
	}

	// +deposit(amount: double): void
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("you cannot deposit this amount! please enter new amount");
		} else {
			balance += amount;
			System.out.println("you deposit $" + amount + " in your account");
		}
	}

}
