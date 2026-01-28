package com.ktdsuniversit.edu.exam.inheritance;

public class Mart extends Store{
	
	int money;
	int money2;

	public Mart(int store) {
		super(store);
		//this.setMoneys(money, money2);
	}
	
	public Mart(int store, int money, int money2) {
		super(store);
		this.money = money;
		this.money2 = money2;
	}
	
	

	public void setMoneys(int money, int money2) {
		
		this.money = money;
		this.money2 = money2;
		
	}

}
