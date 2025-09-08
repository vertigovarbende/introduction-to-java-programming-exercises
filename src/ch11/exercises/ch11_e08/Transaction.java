package ch11.exercises.ch11_e08;

import java.util.Date;

public class Transaction {

	// The private instance variables
	private Date transactionDate; // The date of this transaction.
	private char type; // The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.
	private double amount; // The amount of the transaction
	private double balance; // The new balance after this transaction
	private String description; // The description of this transaction

	// Constructor

	// Smart constructor
	// +Transaction(type: char, amount: double, balance: double, description:
	// String)
	public Transaction(char type, double amount, double balance, String description) {
		transactionDate = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	// Getter and Setter methods

	// Getter method for private instance variable 'type'
	public char getType() {
		return type;
	}

	// Setter method for private instance variable 'type'
	public void setType(char type) {
		this.type = type;
	}

	// Getter method for private instance variable 'amount'
	public double getAmount() {
		return amount;
	}

	// Setter method for private instance variable 'amount'
	public void setAmount(double amount) {
		this.amount = amount;
	}

	// Getter method for private instance variable 'balance'
	public double getBalance() {
		return balance;
	}

	// Setter method for private instance variable 'balance'
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter method for private instance variable 'description'
	public String getDescription() {
		return description;
	}

	// Setter method for private instance variable 'description'
	public void setDescription(String description) {
		this.description = description;
	}

	// Getter method for private instance variable 'transactionDate'
	public Date getTransactionDate() {
		return transactionDate;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Transaction[transactionDate=" + transactionDate
				+ ",type=" + type
				+ ",amount=" + amount
				+ ",balance=" + balance
				+ ",descriotion=" + description
				+ "]\n";
	}
}
