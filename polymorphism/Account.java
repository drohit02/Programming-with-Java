package com.polymorphism;

public class Account {
	
	int balance;
	
	Account()
	{
		
	}
	Account(int initialBalance){
		this.balance = initialBalance;
	}
	
	int getBalance() {
		return this.balance;
	}
 	
	void showBalance() {
		System.out.println("Balance in Account is : "+this.balance);
	}
	void withdraw(int amount) {
		if(this.balance>=amount) {
			this.balance = this.balance - amount ;
		}
		else {
			System.out.println("Insufficent funds");
		}
	}
	
	void deposit(int amount) {
		this.balance+= amount;
	}
}
