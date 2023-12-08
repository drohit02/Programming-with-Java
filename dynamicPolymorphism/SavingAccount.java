package com.dynamicPolymorphism;

public class SavingAccount extends Account {

	int minBalance;
	public SavingAccount(int initialBalance) {
		super(initialBalance);
	}
	public SavingAccount() {
		
	}
	@Override
	void showBalance() {
		System.out.println("Balance in Saving Account is : "+this.balance);
	}
	@Override
	void calInterest() {
		System.out.println("Interest - 2.5 (Saving Account)");
	}
}
