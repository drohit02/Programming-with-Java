package com.dynamicPolymorphism;

public class Bank {
	
	static void processInterest(Account [] acc) {
			for(int i = 0;i<acc.length;i++) {
				acc[i].calInterest();
			}
		}

	public static void main(String[] args) {

		Account acc = new SavingAccount(); //Allowed to create object of  subclass using superclass reference
		//acc.minBalance = 100; ----not allowed to access minBalance field
		
//		SavingAccount sa = new Account(); not allowed to create object of superclass using subclass reference
		
		SavingAccount [] sa = new SavingAccount[5];
		CurrentAccount [] ca = new CurrentAccount[5];
		
		for(int i=0;i<sa.length;i++) {
			sa[i] = new SavingAccount();
		}
		for(int i=0;i<ca.length;i++) {
			ca[i] = new CurrentAccount();
		}
		
		processInterest(sa);
		processInterest(ca);
	}
	
}
