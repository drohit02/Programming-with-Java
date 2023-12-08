package com.abstractKeyword;

public abstract class ChaiKiTapari {
	
	static void nasta() {
		System.out.println("I am abstact class");
	}
	public abstract void chaiBanao();
	public abstract void samosaBanao();
	public abstract void vadaPavBanao();
	void samosa() {
		System.out.println("Samoso from Chai ki Tapari");
	}
	ChaiKiTapari(){
		
	}
	
	public final void chai()
	{
		System.out.println("I am final method in ABstrct class");
	}

  }
