package com.dynamicPolymorphism;

public class CurrentAccount extends Account{

	int overDraftLimit = 3000;
	
	public CurrentAccount(int initialBalance) {
		super(initialBalance);
	}
	public CurrentAccount() {
		
	}
	@Override
	void calInterest() {
		System.out.println("Interest - 4.5 (Current Account)");
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
