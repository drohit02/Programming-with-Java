package com.polymorphism;

public class SavingAccount extends Account {

	SavingAccount(){
		super();
	}
	public SavingAccount(int initialBalance) {
		super(initialBalance);
	}
	@Override
	void showBalance() {
		System.out.println("Balance in Saving Account is : "+this.balance);
	}
}
