package com.polymorphism;

public class CurrentAccount extends Account{

	int overDraftLimit = 3000;
	
	public CurrentAccount(){
		
	}
	CurrentAccount(int initialBalance) {
		super(initialBalance);
	}
	@Override
	void withdraw(int amount) {
		if (this.balance+this.overDraftLimit>=amount)
		{
			this.balance-=amount;
		}
		else {
			System.out.println("Insufficient funds!");
		}
	}
	@Override
	void deposit(int amount) {
		super.deposit(amount);
	}
	@Override
	void showBalance() {
		System.out.println("Balance in Current Account is : "+this.balance);
	}
}
