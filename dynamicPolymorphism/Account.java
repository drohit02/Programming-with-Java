package com.dynamicPolymorphism;

public class Account {
	String name ;
	int accNo;
	int balance;
	
	public Account(){
		
	}
	Account(int initialBalance){
		this.balance = initialBalance;
	}
	//Method going to be overriden at run-time
	
	void calInterest() {
		System.out.println("Interest (Account)");
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

